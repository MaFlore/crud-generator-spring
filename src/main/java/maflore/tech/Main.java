package maflore.tech;

import packageAndFileGenerator.*;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello My Friends, moi c'est MaFlore!");
        System.out.println("Je suis capable de vous aidez en générant le CRUD d'une entité en spring;");
        System.out.println("Pour se faire, vous devez vous assurez que vous avez ajouter toutes");
        System.out.println("les dependances possibles dans le pom.xml de votre projet générer depuis");
        System.out.println("https://start.spring.io/");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom de votre package (ex: com.example ): ");
        String nomDuPackage = scanner.nextLine();
        System.out.print("Entrez le nom de l'entité (ex: User): ");
        String nomEntite = scanner.nextLine();

        String srcPath = "src/main/java/" + nomDuPackage.replace(".", "/") + "/";
        String cheminDuModel = srcPath + "model/";
        String cheminDuRepository = srcPath + "repository/";
        String cheminDuService = srcPath + "service/";
        String cheminDuServiceImpl = srcPath + "serviceImpl/";
        String cheminDuController = srcPath + "controller/";

        // Créer les dossiers
        new File(cheminDuModel).mkdirs();
        new File(cheminDuRepository).mkdirs();
        new File(cheminDuService).mkdirs();
        new File(cheminDuServiceImpl).mkdirs();
        new File(cheminDuController).mkdirs();

        // Générer les fichiers
        ModelGenerator modelGenerator = new ModelGenerator();
        modelGenerator.generateModel(nomEntite, nomDuPackage, cheminDuModel);

        RepositoryGenerator repositoryGenerator = new RepositoryGenerator();
        repositoryGenerator.generateRepository(nomEntite, nomDuPackage, cheminDuRepository);

        ServiceGenerator serviceGenerator = new ServiceGenerator();
        serviceGenerator.generateService(nomEntite, nomDuPackage, cheminDuService);

        ServiceImplGenerator serviceImplGenerator = new ServiceImplGenerator();
        serviceImplGenerator.generateServiceImpl(nomEntite, nomDuPackage, cheminDuServiceImpl);

        ControllerGenerator controllerGenerator = new ControllerGenerator();
        controllerGenerator.generateController(nomEntite, nomDuPackage, cheminDuController);

        System.out.println("Le CRUD pour " + nomDuPackage + " a été généré avec succès !");
        System.out.println("Merci d'avoir faire confiance à MaFlore !");
    }
}