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
        frame.setSize(600, 360);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("Menu.png"); 
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledBackgroundIcon = new ImageIcon(backgroundImage);
        JLabel backgroundLabel = new JLabel(backgroundIcon);

        panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        jouerButton = new JButton("Jouer");
        commentJouerButton = new JButton("Comment jouer ?");
        quitterButton = new JButton("Quitter");

        Font buttonFont = new Font(jouerButton.getFont().getName(), Font.PLAIN, 18);
        jouerButton.setFont(buttonFont);
        commentJouerButton.setFont(buttonFont);
        quitterButton.setFont(buttonFont);

        jouerButton.addActionListener(e -> {
            frame.setVisible(false); // Masquer la fenêtre du menu
        });

        panel.add(jouerButton);
        panel.add(commentJouerButton);
        panel.add(quitterButton);

        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.add(panel, BorderLayout.CENTER);

        frame.setContentPane(backgroundLabel);
        


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
}
