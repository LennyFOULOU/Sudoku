import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class MenuController implements ActionListener {
    private JFrame fenetre;

    public MenuController(JFrame fenetre){
        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        // Code à exécuter lorsque l'action est déclenchée
        if (e.getActionCommand().equals("Jouer")) {
            System.out.println("VIENS ON JOUE ?");
        } else if (e.getActionCommand().equals("Comment jouer ?")) {
            JOptionPane.showMessageDialog(fenetre, "Instructions sur comment jouer...");
        } else if (e.getActionCommand().equals("Quitter")) {
            // Code pour le bouton "Quitter"
            System.exit(0); // Quitter l'application
        }
    }
}
