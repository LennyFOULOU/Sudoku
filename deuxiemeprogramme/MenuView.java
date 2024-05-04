import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Utilise un BoxLayout avec orientation verticale

        jouerButton = new JButton("Jouer");
        jouerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFileSelectionDialog(); // Ouvrir la boîte de dialogue de sélection de fichier
            }
        });
        commentJouerButton = new JButton("Comment jouer ?");
        quitterButton = new JButton("Quitter");

        Font buttonFont = new Font(jouerButton.getFont().getName(), Font.PLAIN, 18);
        jouerButton.setFont(buttonFont);
        commentJouerButton.setFont(buttonFont);
        quitterButton.setFont(buttonFont);

        panel.add(jouerButton);
        panel.add(commentJouerButton);
        panel.add(quitterButton);

        backgroundLabel.setLayout(new BorderLayout());
        backgroundLabel.add(panel, BorderLayout.SOUTH); // Ajoute le panneau en bas de la fenêtre

        frame.setContentPane(backgroundLabel);
    }

    public void show() {
        frame.setVisible(true);
    }

    private void openFileSelectionDialog() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            // Implémentation de la logique de chargement de fichier
        }
    }

    // Méthodes getters pour les boutons et la fenêtre JFrame

    public JButton getJouerButton() {
        return jouerButton;
    }

    public JButton getCommentJouerButton() {
        return commentJouerButton;
    }

    public JButton getQuitterButton() {
        return quitterButton;
    }

    public JFrame getFrame() {
        return frame;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuView menu = new MenuView();
                menu.show();
            }
        });
    }
}
