package GameModel;

import java.util.Arrays;

public class GameBoard {

    static char R = 6;  // R: row - sorok száma
    static char C = 7; // C: column - oszlopok száma
    char[][] gameBoard = new char[R][C];

    public static char getR() {
        return R;
    }

    public static void setR(char r){
        R = r;
    }

    public static char getC() {
        return C;
    }

    public static void setC(char c) {
        C = c;
    }

    public char[][] getGameBoard() {return gameBoard;}

    public void setGameBoard(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    @Override
    public String toString() {
        return "GameBoard{" + "gameBoard=" + Arrays.toString(gameBoard) +
                "}";
    }

    // Egy boolean ellenőrzi, hogy a mozdulat érvényes-e, és ha igen,
    // letesz egy adott szimbólumot
//    public boolean placeCoin(int col, char symbol) {
//        if (col < 0 || col >= C || board[0][col] != '.') return false; // false értéket ad vissza, ha érvénytelen a mozdulat vagy tele van a sor
//        for (int row = R - 1; row >= 0 ; row--) {
//            if (board[row][col] == '.') {
//                board[row][col] = symbol;
//                return true;
//            }
//        }
//        return false;
//    }

//    public void printBoard() {
//        for (char[] row : board) {
//            System.out.println(String.valueOf(row));
//        }
//        System.out.println("0123456"); // Oszlop indexek
//    }

}
