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
                "       List<" + nomEntite + "> " + nomEntite.toLowerCase() + "s = new ArrayList<>();\n" +
                "       try {\n" +
                "           "+ nomEntite.toLowerCase() + "s = " + nomEntite.toLowerCase() + "Service.findAll();\n" +
                "       } catch (Exception e) {\n" +
                "           // TODO: handle exception\n" +
                "           System.out.println(\"Erreur \" + e.getMessage());\n" +
                "       }\n" +
                "       return " + nomEntite.toLowerCase() + "s;\n" +
                "    }\n\n" +
                "    @RequestMapping(value = \"/"+ nomEntite.toLowerCase() + "/{id}\", method = RequestMethod.GET)\n" +
                "    public "+ nomEntite + " findById(@PathVariable Long id){\n" +
                "        " + nomEntite + " " + nomEntite.toLowerCase() + " = new " + nomEntite + "();\n" +
                "       try {\n" +
                "           "+ nomEntite.toLowerCase() + " = " + nomEntite.toLowerCase() + "Service.findById(id);\n" +
                "       } catch(Exception e) {\n" +
                "           // TODO: handle exception\n" +
                "           System.out.println(\"Erreur \" + e.getMessage());\n" +
                "       }\n" +
                "       return " + nomEntite.toLowerCase() + ";\n" +
                "    }\n\n" +
                "    @RequestMapping(value = \"/"+ nomEntite.toLowerCase() + "/save\", method = RequestMethod.POST, headers = \"Accept=Application/json\")\n" +
                "    public "+ nomEntite +" save(@RequestBody "+ nomEntite + " " + nomEntite.toLowerCase() + ") {\n" +
                "        try {\n" +
                "            " + nomEntite.toLowerCase() + " = " + nomEntite.toLowerCase() + "Service.save(" + nomEntite.toLowerCase() + ");\n" +
                "        } catch (Exception e) {\n" +
                "            // TODO: handle exception\n" +
                "            System.out.println(\"Erreur \" + e.getMessage());\n" +
                "        }\n" +
                "        return " + nomEntite.toLowerCase() + ";\n" +
                "    }\n\n" +
                "    @RequestMapping(value = \"/"+ nomEntite.toLowerCase() + "/update\", method = RequestMethod.POST, headers = \"Accept=Application/json\")\n" +
                "    public "+ nomEntite +" update(@RequestBody "+ nomEntite + " " + nomEntite.toLowerCase() + ") {\n" +
                "        try {\n" +
                "            " + nomEntite.toLowerCase() + " = " + nomEntite.toLowerCase() + "Service.update(" + nomEntite.toLowerCase() + ");\n" +
                "        } catch (Exception e) {\n" +
                "            // TODO: handle exception\n" +
                "            System.out.println(\"Erreur \" + e.getMessage());\n" +
                "        }\n" +
                "        return " + nomEntite.toLowerCase() + ";\n" +
                "    }\n\n" +
                "    @RequestMapping(value = \"/"+ nomEntite.toLowerCase() + "/delete/{id}\", method = RequestMethod.DELETE, headers = \"Accept=Application/json\")\n" +
                "    public void deleteById(@PathVariable Long id) {\n" +
                "       this."+ nomEntite.toLowerCase() + "Service.deleteById(id);\n"+
                "    }\n\n" +
                "}\n";
        WriterFile writerFile = new WriterFile();
        writerFile.fileWriter(controllerPath + nomEntite + "Controller.java", contenu);

    }
}
