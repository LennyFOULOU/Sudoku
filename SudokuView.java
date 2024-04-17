import javax.swing.*;
import java.awt.*;

public class SudokuView {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons;

    public SudokuView() {
 // Initialisation de la fenêtre et des composants Swing
 frame = new JFrame("Sudoku");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 panel = new JPanel();
 panel.setLayout(new GridLayout(9, 9));
 buttons = new JButton[9][9];

 // Création des boutons et ajout au panneau
 for (int i = 0; i < 9; i++) {
     for (int j = 0; j < 9; j++) {
         buttons[i][j] = new JButton();
         panel.add(buttons[i][j]);
     }
 }

 frame.add(panel);
 frame.pack();
    }

    public void createAndShowGUI() {
        frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(9, 9));
        buttons = new JButton[9][9];

        // Création des boutons et ajout au panneau
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new JButton();
                panel.add(buttons[i][j]);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    // Méthode pour afficher la grille dans l'interface graphique
        public void displayGrid(int[][] grid) {
            if (grid.length != 9 || grid[0].length != 9) {
                throw new IllegalArgumentException("La grille doit être de taille 9x9.");
            }
        
            // Parcours de la grille et mise à jour des boutons
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    int value = grid[i][j];
                    if (value != 0) {
                        buttons[i][j].setText(Integer.toString(value));
                    } else {
                        buttons[i][j].setText(""); // Si la valeur est 0, efface le texte du bouton
                    }
                }
            }
        } 

    // Méthode pour afficher un message à l'utilisateur
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    // Méthode pour ajouter le contrôleur aux boutons
    public void addController(SudokuController controller) {
        if (buttons == null) {
            throw new IllegalStateException("Les boutons n'ont pas été initialisés.");
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                buttons[i][j].addActionListener(controller);
            }
        }
    }
    public JButton getButton(int row, int col) {
        return buttons[row][col];
    }
}
