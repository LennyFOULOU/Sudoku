import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuView {
    private JFrame frame;
    private JPanel[][] regionPanels;
    private JTextField[][] gridTextFields;

    public SudokuView() {
        frame = new JFrame("Sudoku");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(3, 3));

        regionPanels = new JPanel[3][3];
        gridTextFields = new JTextField[9][9];
        Font textFieldFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel regionPanel = new JPanel(new GridLayout(3, 3, 2, 2));
                regionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

                for (int m = i * 3; m < i * 3 + 3; m++) {
                    for (int n = j * 3; n < j * 3 + 3; n++) {
                        JTextField textField = new JTextField();
                        textField.setPreferredSize(new Dimension(50, 50));
                        textField.setFont(textFieldFont);
                        regionPanel.add(textField);
                        gridTextFields[m][n] = textField;
                    }
                }

                regionPanels[i][j] = regionPanel;
                mainPanel.add(regionPanel);
            }
        }

        frame.add(mainPanel);
        createMenuBar();
    }

    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Retour au Menu");
        JMenuItem verifier = new JMenuItem("Vérifier");

        menu.add(menuItem);
        menu.add(verifier);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
    }

    // Method to display the Sudoku window
    public void display() {
        frame.setVisible(true);
    }
}
