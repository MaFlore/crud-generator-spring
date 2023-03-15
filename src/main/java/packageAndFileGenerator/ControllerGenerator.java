package packageAndFileGenerator;

public class ControllerGenerator {

    public static void generateController(String nomEntite, String packageName, String controllerPath) {
        String contenu = "package " + packageName + ".controller;\n\n" +
                "import java.util.List;\n" +
                "import java.util.ArrayList;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.web.bind.annotation.*;\n" +
                "import " + packageName + ".model." + nomEntite + ";\n" +
                "import " + packageName + ".service." + nomEntite + "Service;\n\n" +
                "@RestController\n" +
                "@RequestMapping(\"/api\")\n" +
                "@CrossOrigin(origins = \"*\")\n"+
                "public class " + nomEntite + "Controller {\n\n" +
                "    @Autowired\n" +
                "    private " + nomEntite + "Service " + nomEntite.toLowerCase() + "Service;\n\n" +
                "    @RequestMapping(value = \"/"+ nomEntite.toLowerCase() + "s\", method = RequestMethod.GET)\n" +
                "    public List<" + nomEntite + "> findAll() {\n" +
                "       List<" + nomEntite + "> \t " + nomEntite.toLowerCase() + "s\" = new ArrayList<>();\n" +
                "       try {\n" +
                "           \""+ nomEntite.toLowerCase() + "s\" = " + nomEntite.toLowerCase() + "Service.findAll();\n" +
                "       } catch (Exception e) {\n" +
                "           // TODO: handle exception\n" +
                "           System.out.println(\"Erreur \" + e.getMessage());\n" +
                "       }\n" +
                "       return " + nomEntite.toLowerCase() + "s\";\n" +
                "    }\n\n" +
                "}\n";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(controllerPath + nomEntite + "Controller.java", contenu);

    }
}
