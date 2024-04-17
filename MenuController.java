import java.awt.event.*;

public class SudokuController {
    private SudokuView view;

    public SudokuController(SudokuView view) {
        this.view = view;
        initializeListeners();
    }

    private void initializeListeners() {
        view.getCommentJouerButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                view.showMessage("Instructions sur comment jouer...");
            }
        });

        view.getQuitterButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Quitte l'application
            }
        });
    }
}
