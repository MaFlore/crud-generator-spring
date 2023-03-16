package packageAndFileGenerator;

public class ServiceImplGenerator {

    public void generateServiceImpl(String nomEntite, String nomDuPackage, String cheminDuServiceImpl) {
        String contenu = "package " + nomDuPackage + ".serviceImpl;\n\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "import java.util.List;\n" +
                "import " + nomDuPackage + ".model." + nomEntite + ";\n" +
                "import " + nomDuPackage + ".repository." + nomEntite + "Repository;\n" +
                "import " + nomDuPackage + ".service." + nomEntite + "Service;\n\n" +
                "@Service\n" +
                "public class " + nomEntite + "ServiceImpl implements " + nomEntite + "Service {\n\n" +
                "    @Autowired\n" +
                "    private " + nomEntite + "Repository " + nomEntite.toLowerCase() + "Repository;\n\n" +
                "    /*Fonction retournant toutes les occurrences de l'entité*/\n" +
                "    @Override\n" +
                "    public List<" + nomEntite + "> findAll() {\n" +
                "       return " + nomEntite.toLowerCase() + "Repository.findAll();\n" +
                "    }\n\n" +
                "    @Override\n" +
                "    /*Fonction retournant les occurrences de l'entité en envoyant son id*/\n" +
                "    public " + nomEntite + " findById(Long id) {\n" +
                "       return " + nomEntite.toLowerCase() + "Repository.findById(id).orElse(null);\n" +
                "    }\n\n" +
                "    /*Fonction d'ajout d'une occurence*/\n" +
                "    @Override\n" +
                "    public " + nomEntite + " save(" + nomEntite + " " + nomEntite.toLowerCase() + ") {\n" +
                "       return " + nomEntite.toLowerCase() + "Repository.save(" + nomEntite.toLowerCase() + ");\n" +
                "    }\n\n" +
                "    /*Fonction de modification d'une occurence*/\n" +
                "    @Override\n" +
                "    public " + nomEntite + " update(" + nomEntite + " " + nomEntite.toLowerCase() + ") {\n" +
                "       return " + nomEntite.toLowerCase() + "Repository.save(" + nomEntite.toLowerCase() + ");\n" +
                "    }\n\n" +
                "    /*Fonction de suppression d'une occurence par id*/\n" +
                "    @Override\n" +
                "    public void deleteById(Long id) {\n" +
                "    " + nomEntite.toLowerCase() + "Repository.deleteById(id);\n" +
                "    }\n\n" +
                "}";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(cheminDuServiceImpl + nomEntite + "ServiceImpl.java", contenu);
    }
}
