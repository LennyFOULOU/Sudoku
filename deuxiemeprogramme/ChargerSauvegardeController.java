import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;

public class ChargerSauvegardeController {
    public int[][] loadGridData(String filePath, JFrame frame) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int[][] gridData = new int[9][9];
            String line;
            int row = 0;
            Pattern pattern = Pattern.compile("[0-9]{9}"); // Expression régulière pour valider une ligne de 9 chiffres
            while ((line = reader.readLine()) != null && row < 9) {
                Matcher matcher = pattern.matcher(line);
                if (!matcher.matches()) {
                    JOptionPane.showMessageDialog(frame, "Erreur : la ligne " + (row + 1) + " contient des caractères non valides.");
                    return null;
                }
                for (int col = 0; col < 9; col++) {
                    char c = line.charAt(col);
                    gridData[row][col] = Character.getNumericValue(c);
                }
                row++;
            }
            if (row != 9) {
                JOptionPane.showMessageDialog(frame, "Erreur : le fichier ne contient pas 9 lignes.");
                return null;
            }
            reader.close();
            System.out.println("Grille chargée avec succès.");
            return gridData;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Erreur lors du chargement de la grille : " + e.getMessage());
        }
        return null;
    }
}
