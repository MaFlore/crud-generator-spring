package packageAndFileGenerator;

public class RepositoryGenerator {

    private static void generateRepository(String nomEntite, String nomDuPackage, String cheminDuRepository) {
        String content = "package " + nomDuPackage + ".repository;\n\n" +
                "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                "import " + nomDuPackage + ".model." + nomEntite + ";\n\n" +
                "public interface " + nomEntite + "Repository extends JpaRepository<" + nomEntite + ", Long> {\n\n" +
                "}";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(cheminDuRepository + nomEntite + "Repository.java", content);
    }

}
