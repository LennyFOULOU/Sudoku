import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VerifierController implements ActionListener {
    private VerifierModel model;
    private VerifierView view;

    public VerifierController(VerifierModel model, VerifierView view) {
        this.model = model;
        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == view.getVerifierButton()) {
            if (model.verify()) {
                JOptionPane.showMessageDialog(view.getFrame(), "Grille valide !");
            } else {
                JOptionPane.showMessageDialog(view.getFrame(), "Grille invalide !");
            }
        }
    }
}