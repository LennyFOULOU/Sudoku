import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuController implements ActionListener {
    private JFrame fenetre;
    private JButton jouerButton;
    private JButton commentJouerButton;
    private JButton quitterButton;

    public MenuController(JFrame fenetre, JButton jouerButton, JButton commentJouerButton, JButton quitterButton) {
        this.fenetre = fenetre;
        this.jouerButton = jouerButton;
        this.commentJouerButton = commentJouerButton;
        this.quitterButton = quitterButton;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jouerButton) {
            fenetre.dispose(); // Fermer la fenêtre du menu
            SudokuView sudokuView = new SudokuView(); // Créer une nouvelle instance de SudokuView
            sudokuView.display(); // Afficher la fenêtre Sudoku
        } else if (source == commentJouerButton) {
            // Logique pour afficher les instructions
        } else if (source == quitterButton) {
            System.exit(0); // Quitter l'application
        }
    }
}
