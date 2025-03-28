package Assignments;

import java.util.*;

public class tictactoe {
    static Boolean terminal(String[][] grid) {
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

    static String winner(String[][] grid) {
        // returns winner

        // horizontal
        for (int i = 0; i < 3; i++) {
            if (grid[i][0].equals(grid[i][1]) & grid[i][1].equals(grid[i][2]) & !grid[i][0].equals("E")) {
                return grid[i][0];
            }
        }
        // vertical
        for (int i = 0; i < 3; i++) {
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

    public static void printBoard(String[][] board) {
        System.out.println();
        System.out.println("  |0|1|2| \n--------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i);
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            if (i < 2) {
                System.out.println("--------");

            }
        }
    }

    public static void main(String[] args) {
        String[][] board = { { "E", "E", "E" }, { "E", "E", "E" }, { "E", "E", "E" } };
        Scanner input = new Scanner(System.in);
        boolean turn = true; // true is X, false is O
        printBoard(board);
        while (true) {

            playermove: while (true) {
                try {
                    System.out.println("What is your move, enter row then column with a space in between");
                    String[] move = input.nextLine().split(" ");
                    if (move.length != 2) {
                        throw new Exception("Please make sure that you follow the format of row then column");
                    }
                    int row = Integer.parseInt(move[0]);
                    int column = Integer.parseInt(move[1]);
                    if (row > 2 || column > 2) {
                        throw new Exception("row AND column must be between 0-2");
                    }
                    if (!board[row][column].equals("E")) {
                        throw new Exception("Index must not be occupied");
                    }
                    board[row][column] = turn ? "X" : "O";
                    turn = !turn;
                    System.out.println("Player " + (turn ? "X" : "O") + " turn:");
                    printBoard(board);
                    break playermove;
                } catch (NumberFormatException err) {
                    System.out.println("Please enter NUMBERS");
                } catch (Exception err) {
                    System.out.println(err);
                }
            }

            if (terminal(board)) {
                System.out.println("Winner is: " + ((winner(board) != null) ? winner(board) : "None; tie game"));
                input.close();
                break;
            }

        }
    }
}
