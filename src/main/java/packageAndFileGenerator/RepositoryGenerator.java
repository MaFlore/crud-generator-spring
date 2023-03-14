package packageAndFileGenerator;

public class RepositoryGenerator {

    public void generateRepository(String nomEntite, String nomDuPackage, String cheminDuRepository) {
        String contenu = "package " + nomDuPackage + ".repository;\n\n" +
                "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                "import org.springframework.stereotype.Repository;\n" +
                "import " + nomDuPackage + ".model." + nomEntite + ";\n\n" +
                "@Repository\n" +
                "public interface " + nomEntite + "Repository extends JpaRepository<" + nomEntite + ", Long> {\n\n" +
                "}";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(cheminDuRepository + nomEntite + "Repository.java", contenu);
    }

}
