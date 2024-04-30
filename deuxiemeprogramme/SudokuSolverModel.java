public class SudokuSolverModel {
    private int[][] grid;

    public SudokuSolverModel(int[][] grid) {
        this.grid = grid;
    }

    public boolean solve() {
        return solveSudoku(0, 0);
    }

    private boolean solveSudoku(int row, int col) {
        if (row == 9) {
            row = 0;
            if (++col == 9) {
                return true; // Sudoku résolu
            }
        }

        if (grid[row][col] != 0) {
            return solveSudoku(row + 1, col);
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidPlacement(row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku(row + 1, col)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }

        return false;
    }

    private boolean isValidPlacement(int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num || grid[i][col] == num) {
                return false;
            }
        }

        int regionRow = (row / 3) * 3;
        int regionCol = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[regionRow + i][regionCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public int[][] getGrid() {
        return grid;
    }
}
