import javax.swing.*;
import java.awt.*;

public class MenuView {
    private JFrame frame;
    private JPanel panel;
    private JButton jouerButton;
    private JButton commentJouerButton;
    private JButton quitterButton;

    public MenuView() {
        frame = new JFrame();
        frame.setSize(200, 200);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        jouerButton = new JButton("Jouer");
        commentJouerButton = new JButton("Comment jouer ?");
        quitterButton = new JButton("Quitter");

        Font buttonFont = new Font(jouerButton.getFont().getName(), Font.PLAIN, 18);
        jouerButton.setFont(buttonFont);
        commentJouerButton.setFont(buttonFont);
        quitterButton.setFont(buttonFont);

        MenuController controller = new MenuController(frame); // Passer la référence de la fenêtre

        jouerButton.addActionListener(controller);
        commentJouerButton.addActionListener(controller);
        quitterButton.addActionListener(controller);

        panel.add(jouerButton);
        panel.add(commentJouerButton);
        panel.add(quitterButton);

        frame.add(panel, BorderLayout.SOUTH);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JButton getJouerButton() {
        return jouerButton;
    }

    public JButton getCommentJouerButton() {
        return commentJouerButton;
    }

    public JButton getQuitterButton() {
        return quitterButton;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }


    public JFrame getFrame() {
        return frame;
    }

    

    /*public static void main(String[] args) {
        // Création de l'interface du menu
        MenuView menu = new MenuView();
        menu.show();
    }*/
}
