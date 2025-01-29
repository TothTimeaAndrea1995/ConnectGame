package GameModel;

//import java.util.Arrays;

public class GameBoard {
    // Mivel nem szeretném módosítani a tábla sorait és oszlopait,
    // ezért használtam private static final-t
    private char[][] board;
    private static final int R = 6;  // R: row - sorok száma
    private static final int C = 7; // C: column - oszlopok száma

    public static int getR() {return R;}
    public static int getC() {return C;}
    public char[][] getGameBoard() {return board;}

    // Egy boolean ellenőrzi, hogy a mozdulat érvényes-e, és ha igen,
    // letesz egy adott szimbólumot
    public boolean placeCoin(int col, char symbol) {
        if (col < 0 || col >= C || board[0][col] != '.') return false; // false értéket ad vissza, ha érvénytelen a mozdulat vagy tele van a sor
        for (int row = R - 1; row >= 0 ; row--) {
            if (board[row][col] == '.') {
                board[row][col] = symbol;
                return true;
            }
        }
        return false;
    }

    public void printBoard() {
        for (char[] row : board) {
            System.out.println(String.valueOf(row));
        }
        System.out.println("0123456"); // Oszlop indexek
    }

}
