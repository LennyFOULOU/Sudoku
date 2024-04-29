public class CaseController {
    private Case[][] grid;

    public CaseController() {
        grid = new Case[9][9];
        // Initialiser la grille avec des cases vides
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new Case();
            }
        }
    }

    public void setNumber(int row, int col, int num) {
        // Vérifier si la case est vide avant de définir le numéro
        if (grid[row][col].isEmpty()) {
            grid[row][col].setValue(num);
        } else {
            // Gérer le cas où la case est déjà remplie
            System.out.println("Case already filled!");
        }
    }

    // Ajoutez d'autres méthodes pour gérer les cases de la grille de Sudoku selon vos besoins
}