import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuController implements ActionListener {
    private JFrame fenetre;

    public MenuController(JFrame fenetre){
        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        // Code à exécuter lorsque l'action est déclenchée
        if (e.getActionCommand().equals("Jouer")) {
            // Création et affichage de la vue SudokuView
            SudokuView sudokuView = new SudokuView();
            sudokuView.show();
        } else if (e.getActionCommand().equals("Comment jouer ?")) {
            JOptionPane.showMessageDialog(fenetre, "Instructions sur comment jouer...");
        } else if (e.getActionCommand().equals("Quitter")) {
            // Code pour le bouton "Quitter"
            System.exit(0); // Quitter l'application
        }
    }
}
