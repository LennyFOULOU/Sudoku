import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class VerifierController {
    private VerifierView view;

    public VerifierController(VerifierView view) {
        this.view = view;
    }

    public void showMessage(String message) {
        JFrame frame = view.getFrame();

        // Afficher le message dans une boîte de dialogue
        JOptionPane.showMessageDialog(frame, message);
    }
}
