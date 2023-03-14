package packageAndFileGenerator;

public class ServiceGenerator {

    public void generateService(String nomEntite, String nomDuPackage, String cheminDuService) {
        String contenu = "package " + nomDuPackage + ".service;\n\n" +
                "import java.util.List;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "import " + nomDuPackage + ".model." + nomEntite + ";\n\n" +
                "@Service\n" +
                "public interface " + nomEntite + "Service {\n\n" +
                "    /*Fonction retournant toutes les occurrences de l'entité*/\n\n" +
                "    List<" + nomEntite + "> findAll();\n\n" +
                "    /*Fonction retournant les occurrences de l'entité en envoyant son id*/\n\n" +
                "    " + nomEntite + " findById(Long id);\n\n" +
                "    /*Fonction d'ajout d'une occurence*/\n\n" +
                "    " + nomEntite + " save("+ nomEntite.toLowerCase() + ");\n\n" +
                "    /*Fonction de modification d'une occurence*/\n\n" +
                "    " + nomEntite + "update("+ nomEntite.toLowerCase() + ");\n\n" +
                "    /*Fonction de suppression d'une occurence par id*/\n\n" +
                "    void deleteById(Long id);\n\n" +
                "}";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(cheminDuService + nomEntite + "Service.java", contenu);
    }
}
