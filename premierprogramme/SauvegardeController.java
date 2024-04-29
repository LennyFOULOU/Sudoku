import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SauvegardeController {
    private static final String CHEMIN_FICHIER = "../fichier.gri";

    public void saveData(int[][] sudokuGridData) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(CHEMIN_FICHIER));
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
