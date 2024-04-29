import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Création de la vue du menu
        MenuView menuView = new MenuView();

        // Obtention des boutons du menu
        JButton jouerButton = menuView.getJouerButton();
        JButton commentJouerButton = menuView.getCommentJouerButton();
        JButton quitterButton = menuView.getQuitterButton();

        // Création du contrôleur du menu
        JFrame frame = menuView.getFrame(); // Obtenez la JFrame de la vue du menu
        MenuController menuController = new MenuController(frame, jouerButton, commentJouerButton, quitterButton);

        // Ajout du contrôleur du menu aux boutons du menu
        jouerButton.addActionListener(menuController);
        commentJouerButton.addActionListener(menuController);
        quitterButton.addActionListener(menuController);

        // Affichage de la vue du menu
        menuView.show();

        // Chemin du fichier contenant les représentations canoniques Java des entiers
        String cheminFichier = "bazzaou/dev/dev2/SAE21_2023/";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(cheminFichier));
            String line;

            // Lire chaque ligne du fichier
            while ((line = reader.readLine()) != null) {
                // Ignorer les lignes vides
                if (!line.isEmpty()) {
                    // Convertir la ligne en entier
                    int number = Integer.parseInt(line.replace("0", ""));
                    System.out.println(number);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format des entiers dans le fichier : " + e.getMessage());
        }
    }
}
