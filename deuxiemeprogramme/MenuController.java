import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuController implements ActionListener {
    private JFrame frame;
    private JButton jouerButton;
    private JButton commentJouerButton;
    private JButton quitterButton;

    public MenuController(JFrame frame, JButton jouerButton, JButton commentJouerButton, JButton quitterButton) {
        this.frame = frame;
        this.jouerButton = jouerButton;
        this.commentJouerButton = commentJouerButton;
        this.quitterButton = quitterButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jouerButton) {
            openFileSelectionDialog(); // Ouvrir la boîte de dialogue de sélection de fichier
        } else if (e.getSource() == commentJouerButton) {
            // Logique pour afficher les instructions pour jouer
        } else if (e.getSource() == quitterButton) {
            // Logique pour quitter l'application
            System.exit(0);
        }
    }

    private void openFileSelectionDialog() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            ChargerSauvegardeController charger = new ChargerSauvegardeController();
            int[][] savedGridData = charger.loadGridData(frame);

            if (savedGridData != null) {
                frame.dispose();
                SudokuView sudokuView = new SudokuView(savedGridData); // Passer les données de la grille
                sudokuView.display();
            }
        }
    }
}
