package packageAndFileGenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

    public void fileWriter(String cheminDuFichier, String contenu){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(cheminDuFichier));
            writer.write(contenu);
            writer.close();
            System.out.println("Fichier écrit avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur !");
            e.printStackTrace();
        }
    }
}
