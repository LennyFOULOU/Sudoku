import javax.swing.*;
import java.awt.*;

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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SudokuView sudokuView = new SudokuView();
            sudokuView.show();
        });
    }
}
