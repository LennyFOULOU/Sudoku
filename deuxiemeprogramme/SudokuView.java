import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuView {
    private JFrame frame;
    private JPanel[][] regionPanels;
    private JTextField[][] gridTextFields;

    public SudokuView(int[][] gridData) {
        frame = new JFrame("Sudoku");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(3, 3));

        regionPanels = new JPanel[3][3];
        gridTextFields = new JTextField[9][9];
        Font textFieldFont = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JPanel regionPanel = new JPanel(new GridLayout(3, 3, 2, 2));
                regionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

                for (int m = i * 3; m < i * 3 + 3; m++) {
                    for (int n = j * 3; n < j * 3 + 3; n++) {
                        JTextField textField = new JTextField();
                        textField.setPreferredSize(new Dimension(50, 50));
                        textField.setFont(textFieldFont);
                        regionPanel.add(textField);
                        gridTextFields[m][n] = textField;
                        if (gridData[m][n] != 0) {
                            textField.setText(String.valueOf(gridData[m][n])); // Mettez à jour le champ de texte avec les données de la grille
                            textField.setEditable(false); // Rendez le champ de texte non éditable
                        }
                    }
                }

                regionPanels[i][j] = regionPanel;
                mainPanel.add(regionPanel);
            }
        }

        frame.add(mainPanel);
        createMenuBar();
    }




    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Retour au Menu");
        JMenuItem verifier = new JMenuItem("Vérifier");
        JMenuItem sauvegarder = new JMenuItem("Sauvegarder");

        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MenuView menuView = new MenuView();
                menuView.show();
            }
        });

        verifier.addActionListener(e -> {
            int[][] sudokuGridData = getSudokuGridData();
            VerifierModel verifierModel = new VerifierModel(sudokuGridData);
            if (verifierModel.verify()) {
                showMessage("La grille est correcte !");
            } else {
                showMessage("La grille contient des erreurs.");
            }
        });

        sauvegarder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SauvegardeController sauvegardeController = new SauvegardeController();
                int[][] sudokuGridData = getSudokuGridData();
                sauvegardeController.saveData(sudokuGridData);
            }
        });

        menu.add(menuItem);
        menu.add(verifier);
        menu.add(sauvegarder);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
    }

    public void display() {
        frame.setVisible(true);
    }

    public JTextField[][] getGridTextFields() {
        return gridTextFields;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public int[][] getSudokuGridData() {
        int[][] gridData = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField textField = gridTextFields[i][j];
                String text = textField.getText();
                if (text.isEmpty()) {
                    gridData[i][j] = 0;
                } else {
                    gridData[i][j] = Integer.parseInt(text);
                }
            }
        }
        return gridData;
    }
}
