import javax.swing.*;
import java.awt.*;

public class SudokuView {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] gridButtons;

    public SudokuView() {
        frame = new JFrame();
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(3, 3, 5, 5));
        gridButtons = new JButton[9][9];
        Font buttonFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        for (int i = 0; i < 9; i++) {
            JPanel subPanel = new JPanel(new GridLayout(3, 3, 1, 1));
            for (int j = 0; j < 9; j++) {
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(50, 50)); // Réglez la taille des boutons selon vos préférences
                button.setFont(buttonFont);
                subPanel.add(button);
                gridButtons[i][j] = button;
            }
            panel.add(subPanel);
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

    /*public static void main(String[] args) {
        SudokuView SudokuView = new SudokuView();
        SudokuView.show();
    }*/
}