import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SauvegardeController {
    public void saveData(int[][] sudokuGridData) {
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        writer.write(String.valueOf(sudokuGridData[i][j]));
                    }
                    writer.newLine();
                }
                writer.close();
                System.out.println("Données sauvegardées avec succès.");
            } catch (IOException e) {
                System.err.println("Erreur lors de la sauvegarde des données : " + e.getMessage());
            }
        }
    }
}
