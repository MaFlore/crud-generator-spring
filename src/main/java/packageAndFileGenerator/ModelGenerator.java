package packageAndFileGenerator;

public class ModelGenerator {

    public void generateModel(String nomEntite, String nomPackage, String cheminDuModel) {
        String contenu = "package " + nomPackage + ".model;\n\n" +
                "import javax.persistence.*;\n\n" +
                "@Entity\n" +
                "@Table(name = \"" + nomEntite.toLowerCase() + "s\")\n" +
                "public class " + nomEntite + " {\n\n" +
                "    @Id\n" +
                "    @GeneratedValue(strategy = GenerationType.IDENTITY)\n" +
                "    private Long id;\n\n" +
                "    /*Ajouter ici les autres attributs de l'entité ainsi que leurs types*/\n\n" +
                "    public Long getId() {\n" +
                "        return id;\n" +
                "    }\n\n" +
                "    public void setId(Long id) {\n" +
                "        this.id = id;\n" +
                "    }\n\n" +
                "    /*Ajoutez les autres propriétés de l'entité ici*/\n\n" +
                "    /*Ajoutez les autres getters et setters ici*/\n\n" +
                "}";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(cheminDuModel + nomEntite + ".java", contenu);
    }
}
