package SAE21_2023;
import javax.swing.*;
import java.awt.*;
 
public class Menu {
  public static void main(String[] args) {
    // un objet pour servir de fenetre
    JFrame fenetre = new JFrame();
    // on configure la fenetre
    fenetre.setSize(200, 200);
    fenetre.setLocation(100, 100);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panelBoutons = new JPanel();
    panelBoutons.setLayout(new BoxLayout(panelBoutons, BoxLayout.Y_AXIS));
   
    JButton jouer = new JButton("Jouer");
    JButton comment_jouer = new JButton("Comment jouer ?");
    JButton quitter = new JButton("Quitter");

    Font boutonFont = new Font(jouer.getFont().getName(), Font.PLAIN, 18);
    jouer.setFont(boutonFont);
    comment_jouer.setFont(boutonFont);
    quitter.setFont(boutonFont);

    panelBoutons.add(jouer);
    panelBoutons.add(comment_jouer);
    panelBoutons.add(quitter);

    // Ajout du JPanel contenant les boutons à la fenêtre
    fenetre.add(panelBoutons, BorderLayout.SOUTH);
    fenetre.setVisible(true);
  }
}