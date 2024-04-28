import javax.swing.*;

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
    }
}