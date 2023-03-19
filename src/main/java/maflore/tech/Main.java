package maflore.tech;

import packageAndFileGenerator.*;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean continuer = true;

        System.out.println("Hello My Friends, moi c'est MaFlore!");
        System.out.println("Je suis capable de vous aidez à générer le CRUD d'une entité en spring ,");
        System.out.println("Pour se faire, vous devez vous assurez que vous avez ajouter toutes ,");
        System.out.println("les dependances possibles dans le pom.xml de votre projet générer depuis ,");
        System.out.println("https://start.spring.io/ ,");
        System.out.println("Pour commencer : ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nCopiez le chemin vers votre projet dans lequel \nVous voulez générer le crud (ex: C:\\mon_projet): ");
        String cheminPrincipal = scanner.nextLine();
        System.out.print("Entrez le <groupId> que votre projet (ex: com.example ): ");
        String nomDuPackage = scanner.nextLine();
        while (continuer) {
            System.out.print("Entrez le nom de l'entité (ex: User): ");
            String nomEntite = scanner.nextLine();

            String cheminVersLaSource = cheminPrincipal + "/src/main/java/" + nomDuPackage.replace(".", "/") + "/";
            String cheminDuModel = cheminVersLaSource + "model/";
            String cheminDuRepository = cheminVersLaSource + "repository/";
            String cheminDuService = cheminVersLaSource + "service/";
            String cheminDuServiceImpl = cheminVersLaSource + "serviceImpl/";
            String cheminDuController = cheminVersLaSource + "controller/";

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

            System.out.println("\nLe CRUD de "+ nomEntite + " a été généré avec succès !");

            // Demander à l'utilisateur s'il veut continuer
            System.out.print("Voulez-vous générer le CRUD d'une autre entité ? (Oui/Non) : ");
            String reponse = scanner.nextLine();
            // Sortir de la boucle si l'utilisateur répond "non"
            if (!reponse.equalsIgnoreCase("oui") || !reponse.equalsIgnoreCase("Oui")) {
                continuer = false;
            }
        }
        System.out.println("Merci d'avoir faire confiance à MaFlore !");
    }
}