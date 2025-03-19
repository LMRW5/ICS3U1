import java.util.*;

public class tictactoe {
    public static String turn(String[][] grid){
        // finds whos player turn
        int xctr = 0;
        int octr = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3;j++){
                int ctr = 0;
                String val = grid[i][j];
                if (val.equals("X")){
                    xctr += 1;
                }
                else if (val.equals("O")){
                    octr += 1;
                }
            }
        }
        if (xctr > octr){
            return "O";
        }
        else{
            return "X";
        }
    }
    static String[][] update(String[][] grid, int xpair, int ypair){
        //returns updated grid
        String turn = turn(grid);
        grid[ypair][xpair] = turn;
        return grid;
    }

    static Boolean terminal(String[][] grid){
        // checks if game has ended
        for (int i = 0; i < 3; i++){
            for (int j = 0; j<3; j++){
                if (grid[i][j].equals("E")){
                    return false;
                }
            }
        }
        return true;
    }

    static String winner(String[][] grid){
        // returns winner

        // horizontal
        for (int i = 0; i<3;i++){
            if (grid[i][0].equals(grid[i][1]) & grid[i][1].equals(grid[i][2])){
                return grid[i][0];
            }
        }
        // vertical
        for (int i = 0; i < 3; i++){
            if (grid[0][i].equals(grid[1][i]) & grid[1][i].equals(grid[2][i])){
                return grid[0][i];
            }
        }
        // diagnoals
        if (grid[0][0].equals(grid[1][1]) & grid[1][1].equals(grid[2][2]) & !(grid[0][0].equals("E"))){
            return grid[0][0];
        }
        if (grid[0][2].equals(grid[1][1]) & grid[1][1].equals(grid[2][0]) & !(grid[0][0].equals("E"))){
            return grid[1][1];
        }

        // no winner
        return null;

    }
    
    static int utility(String[][] grid){
        // returns status of board
        String val = winner(grid);
        if (val.equals("X")){
            return 1;
        }
        else if (val.equals("O")){
            return -1;
        }
        else{
            return 0;
        }
    }
    static int[][] actions(String [][] grid){
        ArrayList<Array<Integer>> rval = new ArrayList<Array<Integer>>();
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j<grid[0].length;j++){
                if (grid[i][j].equals("E")){
                    rval.add([i,j]);
                }
            }
        }

    }
    static String[] minimax(String[][] grid){
        // returns best move for the grid
        String turn = turn(grid);
        if (terminal(grid)){
            return null;
        }
        if (turn.equals("X")){
            // MAX  player
        }
        else if (turn.equals("O")){
            // MIN player
        }

        static maxi
    }
    public static void main(String[] args) {
        String[][] grid = {{"E","E","E"},{"E","E","E"},{"E","E","E"}};

    }
}