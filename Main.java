import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       /* MenuView view = new MenuView();
        MenuController controller = new MenuController(view);
        view.show();*/
        
        SudokuGrid model = new SudokuGrid();
        SudokuView view = new SudokuView();
        SudokuController controller = new SudokuController(model, view);

        view.addController(controller);


        SwingUtilities.invokeLater(() -> {
            view.createAndShowGUI();
        });
    }
}
