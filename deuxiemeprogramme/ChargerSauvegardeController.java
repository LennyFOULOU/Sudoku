import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChargerSauvegardeController {
    public int[][] loadGridData(JFrame frame) {
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showOpenDialog(frame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try {
                String filePath = fileChooser.getSelectedFile().getAbsolutePath();
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                int[][] gridData = new int[9][9];
                int row = 0;
                String line;
                while ((line = reader.readLine()) != null && row < 9) {
                    int col = 0;
                    for (int i = 0; i < line.length() && col < 9; i++) {
                        char c = line.charAt(i);
                        if (Character.isDigit(c)) {
                            gridData[row][col] = Character.getNumericValue(c);
                            col++;
                        }
                    }
                    row++;
                }
                reader.close();
                System.out.println("Grille chargée avec succès.");
                return gridData;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(frame, "Erreur lors du chargement de la grille : " + e.getMessage());
            }
        }
        return null;
    }
}
