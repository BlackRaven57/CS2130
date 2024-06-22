package cs2130;

import java.util.Arrays;

public class Nqueens {

    private int n;
    int[] queens;

    public Nqueens(int n){
        this.n = n;
        queens = new int[n];
        for (int i = 0; i < n; i++) {
            queens[i] = -1;
        }
    }

    public int[] getQueens() {
        return queens;
    }

    public void setQueens(int[] queens) {
        this.queens = queens;
    }

    public void printSolution(){
        //TODO:
        /*If queens[0] = -1 you should print "No solution"
        When printing the board use "|" to separate columns and
        new lines to separate rows.  Mark queens with a "Q" and empty
        squares with a " "
         */
        // Printing Rows (Loop)
        if (queens[0] == -1) {
            System.out.print("No solution\n");
            return;
        }
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                System.out.print("|");
                if (queens[i] == j) {
                    System.out.print("Q");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("|\n");
        }

    }

    boolean isValid(int rows){
        // Column Checking
        int[] column = new int[queens.length];
        boolean bool = true;

        for (int i = 0; i < queens.length; i++) {
            column[i] = queens[i];
        }

        Arrays.sort(column);
        for (int i = 0; i < (rows - 1); i++) {
            if (column[i] == column[i + 1]) {
                bool = false;
                break;
            }
        }

        // Diagnal Checking
        for (int x = 0; x < (rows - 1); x++) {
            for (int y = (x + 1); y < (rows - x); y++) {
                if ((queens[x] + x) == (queens[y] + y)) {
                    bool = false;
                    break;
                }
                else if ((x - queens[x]) == (y - queens[y])) {
                    bool = false;
                    break;
                }
            }
        }

        return bool;
    }


    private boolean backtrack(int row){

        if (row == n){
            return isValid(row);
        }
        for (int col = 0; col < n; col++) {
            queens[row] = col;
            if (isValid(row+1) && backtrack(row+1)){
                return true;
            }
            queens[row] = -1;
        }
        return false;
    }

    public void backtrackingFindSolution(){
        backtrack(0);
    }

    private boolean bruteforce(int row){
        if (row == n){
            return isValid(row);
        }
        for (int col = 0; col < n; col++) {
            queens[row] = col;
            if(bruteforce(row+1)){
                return true;
            }
            queens[row] = -1;
        }
        return false;
    }

    public void bruteForceFindSolution(){
        bruteforce(0);
    }


}
