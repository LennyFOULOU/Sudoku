import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SudokuView {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] gridButtons;

    public SudokuView() {
        frame = new JFrame("Sudoku");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(9, 9, 5, 5));
        gridButtons = new JButton[9][9];
        Font buttonFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50)); // Réglez la taille des boutons selon vos préférences
                button.setFont(buttonFont);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton clickedButton = (JButton) e.getSource();
                        // Vous pouvez récupérer la position du bouton dans la grille et demander à l'utilisateur de saisir un numéro
                        // Par exemple :
                        int row = 0; // Remplacez par la vraie ligne
                        int col = 0; // Remplacez par la vraie colonne
                        String input = JOptionPane.showInputDialog(frame, "Entrez un numéro pour la case :");
                        int num = Integer.parseInt(input);
                        // Ensuite, utilisez votre contrôleur pour définir le numéro dans la case correspondante
                    }
                });
                panel.add(button);
                gridButtons[i][j] = button;
            }
        }

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JButton[][] getGridButtons() {
        return gridButtons;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }


}
