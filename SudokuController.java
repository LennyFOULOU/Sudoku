import java.awt.event.*;

public class SudokuController implements ActionListener {
    private SudokuGrid model;
    private SudokuView view;

    public SudokuController(SudokuGrid model, SudokuView view) {
        this.model = model;
        this.view = view;

        // Ajout du contrôleur aux boutons de la vue
        view.addController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Récupérer la source de l'événement
        Object source = e.getSource();

        // Parcourir les boutons de la grille
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (source == view.getButton(row, col)) {
                    // Action spécifique au bouton cliqué (par exemple, placer un nombre)
                    // Vous pouvez appeler les méthodes de modèle ici, par exemple :
                    // model.setNumber(row, col, num);
                }
            }
        }
    }
    MenuController menuController = new MenuController(menuView.getFrame());

}
