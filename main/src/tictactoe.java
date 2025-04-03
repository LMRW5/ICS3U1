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
        return xctr > octr ? "O" : "X";
    }

    public static boolean terminal(String[][] grid) {
        // checks if game has ended
        if (winner(grid) != null) {
            return true;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j].equals("E")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String winner(String[][] grid) {
        // returns winner

        // horizontal
        for (int i = 0; i < 3; i++) {
            if (grid[i][0].equals(grid[i][1]) & grid[i][1].equals(grid[i][2]) & !grid[i][0].equals("E")) {
                return grid[i][0];
            }
            // vertical
            if (grid[0][i].equals(grid[1][i]) & grid[1][i].equals(grid[2][i]) & !grid[0][i].equals("E")) {
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

    public static int utility(String[][] grid) {
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

    public static List<int[]> actions(String[][] grid) {
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

    public static String[][] result(String[][] board, int[] action) {
        // returns output state
        int i = action[0];
        int j = action[1];
        String[][] newboard = new String[3][3];
        for (int row = 0; row < board.length; row++) {
            newboard[row] = board[row].clone();
        }
        newboard[i][j] = turn(board);
        return newboard;
    }

    public static int[] minimax(String[][] grid) {
        // returns best move for the grid
        String turn = turn(grid);
        if (terminal(grid)) {
            return null;
        }
        if (turn.equals("X")) {
            // MAX player
            double best = Double.NEGATIVE_INFINITY;
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
            double best = Double.POSITIVE_INFINITY;
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
        double value = Double.NEGATIVE_INFINITY;
        for (int[] action : actions(state)) {
            value = Math.max(value, minval(result(state, action)));

        }
        return value;
    }

    public static double minval(String[][] state) {
        if (terminal(state)) {
            return utility(state);
        }
        double value = Double.POSITIVE_INFINITY;
        for (int[] action : actions(state)) {
            value = Math.min(value, maxval(result(state, action)));
        }
        return value;
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-------");

            }
        }
    }

    public static String[][] init() {
        String[][] grid = { { "E", "E", "E" }, { "E", "E", "E" }, { "E", "E", "E" } };
        return grid;
    }

    public static void main(String[] args) {
        String[][] board = init();
        Scanner input = new Scanner(System.in);
        boolean ai_turn;
        System.out.println();
        while (true) {
            while (true) {
                System.out.println("Would you like to play X or O");
                char player = input.nextLine().charAt(0);
                if (player == 'X' | player == 'x') {
                    ai_turn = false;
                    break;
                } else if (player == 'O' | player == 'o') {
                    ai_turn = true;
                    break;
                } else {
                    System.out.println("Please enter either X or O");
                }
            }
            printBoard(board);
            while (true) {

                if (ai_turn) {
                    int[] computer = minimax(board);
                    System.out.println("AI turn... ");
                    board = result(board, computer);
                    ai_turn = !ai_turn;
                    System.out.println("Computer: ");
                    printBoard(board);
                }
                if (terminal(board)) {
                    System.out.println("Winner is: " + winner(board));
                    break;
                }

                playermove: while (true) {
                    try {
                        System.out.println(
                                "What is your move, enter row then column with a space in between. (zero indexed)");
                        String[] move = input.nextLine().split(" ");
                        if (move.length != 2) {
                            throw new Exception(
                                    "Please make sure that you follow the format of row then column (zero indexed)");
                        }
                        int row = Integer.parseInt(move[0]);
                        int column = Integer.parseInt(move[1]);
                        if (!board[row][column].equals("E")) {
                            throw new Exception("Index must not be occupied");
                        }
                        int[] moveval = { row, column };
                        board = result(board, moveval);
                        ai_turn = true;
                        System.out.println("Player: ");
                        printBoard(board);
                        break playermove;
                    } catch (NumberFormatException err) {
                        System.out.println("Please enter NUMBERS");
                    } catch (Exception err) {
                        System.err.println(err);
                    }
                }
                if (terminal(board)) {
                    System.out.println("Winner is: " + (winner(board) != null ? winner(board) : "None; Its a tie"));
                    break;
                }

            }
            System.out.println("would you like to play again (y/n)");
            while (true) {
                char x = input.nextLine().charAt(0);
                if (x == 'y' || x == 'Y') {
                    board = init();
                    break;
                } else if (x == 'n' || x == 'N') {
                    input.close();
                    return;
                } else {
                    System.out.println("please enter y or n");
                }

            }
        }
    }
}