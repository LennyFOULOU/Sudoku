import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        // Ajout des écouteurs d'événements
        jouerButton.addActionListener(this);
        commentJouerButton.addActionListener(this);
        quitterButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jouerButton) {
            // La logique spécifique pour jouer sera traitée dans MenuView
            // Nous n'avons pas besoin d'une action spécifique ici
        } else if (e.getSource() == commentJouerButton) {
            // Logique pour afficher les instructions pour jouer
        } else if (e.getSource() == quitterButton) {
            // Logique pour quitter l'application
            System.exit(0);
        }
    }
}
