import java.util.*;

public class tictactoe {
    public static String turn(String[][] grid) {
        // finds whos player turn
        int xctr = 0;
        int octr = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String val = grid[i][j];
                if (val.equals("X")) {
                    xctr += 1;
                } else if (val.equals("O")) {
                    octr += 1;
                }
            }
        }
        if (xctr > octr) {
            return "O";
        } else {
            return "X";
        }
    }

    static String[][] update(String[][] grid, int xpair, int ypair) {
        // returns updated grid
        String turn = turn(grid);
        String[][] newgrid = grid.clone();
        newgrid[ypair][xpair] = turn;
        return newgrid;
    }

    static Boolean terminal(String[][] grid) {
        // checks if game has ended
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j].equals("E")) {
                    return false;
                }
            }
        }
        return true;
    }

    static String winner(String[][] grid) {
        // returns winner

        // horizontal
        for (int i = 0; i < 3; i++) {
            if (grid[i][0].equals(grid[i][1]) & grid[i][1].equals(grid[i][2])) {
                return grid[i][0];
            }
        }
        // vertical
        for (int i = 0; i < 3; i++) {
            if (grid[0][i].equals(grid[1][i]) & grid[1][i].equals(grid[2][i])) {
                return grid[0][i];
            }
        }
        // diagnoals
        if (grid[0][0].equals(grid[1][1]) & grid[1][1].equals(grid[2][2]) & !(grid[0][0].equals("E"))) {
            return grid[0][0];
        }
        if (grid[0][2].equals(grid[1][1]) & grid[1][1].equals(grid[2][0]) & !(grid[0][2].equals("E"))) {
            return grid[1][1];
        }

        // no winner
        return null;

    }

    static int utility(String[][] grid) {
        // returns status of board
        String val = winner(grid);
        if (val == null) {
            return 0;
        }
        if (val.equals("X")) {
            return 1;
        } else if (val.equals("O")) {
            return -1;
        } else {
            return 0;
        }
    }

    static List<int[]> actions(String[][] grid) {
        List<int[]> rval = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].equals("E")) {
                    rval.add(new int[] { i, j });
                }
            }
        }
        return rval;

    }

    static String[][] result(String[][] board, int[] action) {
        int i = action[0];
        int j = action[1];
        String[][] newboard = board.clone();
        newboard[i][j] = turn(board);
        return newboard;
    }

    static int[] minimax(String[][] grid) {
        // returns best move for the grid
        String turn = turn(grid);
        if (terminal(grid)) {
            return null;
        }
        if (turn.equals("X")) {
            // MAX player
            double best = -999999999;
            int[] bestAction = new int[2];
            for (int[] action : actions(grid)) {
                double value = minval(result(grid, action));
                if (value > best) {
                    best = value;
                    bestAction = action;
                }
            }
            return bestAction;
        } else {
            // MIN player
            double best = 999999999;
            int[] bestAction = new int[2];
            for (int[] action : actions(grid)) {
                double value = maxval(result(grid, action));
                if (value < best) {
                    best = value;
                    bestAction = action;
                }

            }
            return bestAction;
        }

    }

    public static double maxval(String[][] state) {
        if (terminal(state)) {
            return utility(state);
        }
        double value = -999999999;
        for (int[] action : actions(state)) {
            if (value > minval(result(state, action))) {
                value = minval(result(state, action));
            }
        }
        return value;
    }

    public static double minval(String[][] state) {
        if (terminal(state)) {
            return utility(state);
        }
        double value = 999999999;
        for (int[] action : actions(state)) {
            if (value < maxval(result(state, action))) {
                value = maxval(result(state, action));
            }
        }
        return value;
    }

    public static void main(String[] args) {
        String[][] grid = { { "E", "E", "E" }, { "E", "E", "E" }, { "E", "E", "E" } };

    }
}
