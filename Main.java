import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        // Création de la vue du menu
        MenuView menuView = new MenuView();

        // Création du contrôleur du menu
        JFrame frame = menuView.getFrame(); // Obtenez la JFrame de la vue du menu
        MenuController menuController = new MenuController(frame);

        // Ajout du contrôleur du menu aux boutons du menu
        menuView.getJouerButton().addActionListener(menuController);
        menuView.getCommentJouerButton().addActionListener(menuController);
        menuView.getQuitterButton().addActionListener(menuController);

        // Affichage de la vue du menu
        menuView.show();
    }
}
