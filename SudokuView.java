import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SudokuView {
    private JFrame frame;
    private JPanel panel;
    private JTextField[][] gridTextFields;

    public SudokuView() {
        frame = new JFrame("Sudoku");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(9, 9, 5, 5));
        gridTextFields = new JTextField[9][9];
        Font textFieldFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField textField = new JTextField();
                textField.setPreferredSize(new Dimension(50, 50)); // Réglez la taille des zones de texte selon vos préférences
                textField.setFont(textFieldFont);
                panel.add(textField);
                gridTextFields[i][j] = textField;
            }
        }

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JTextField[][] getGridTextFields() {
        return gridTextFields;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
