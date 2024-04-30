import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame; // Importez JFrame si ce n'est pas déjà fait

public class VerifierController implements ActionListener {
    private VerifierModel model;
    private VerifierView view;

    public VerifierController(VerifierModel model, VerifierView view) {
        this.model = model;
        this.view = view;
        // Ajouter le contrôleur comme auditeur du bouton de vérification
        view.getVerifierButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == view.getVerifierButton()) {
            if (model.verify()) {
                // Utilisez le cadre JFrame directement sans passer par la méthode getFrame()
                JOptionPane.showMessageDialog((JFrame)view.getVerifierButton().getTopLevelAncestor(), "Grille valide !");
            } else {
                // Utilisez le cadre JFrame directement sans passer par la méthode getFrame()
                JOptionPane.showMessageDialog((JFrame)view.getVerifierButton().getTopLevelAncestor(), "Grille invalide !");
            }
        }
    }
}
