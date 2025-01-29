package GameModel;

public class GameBoard {
    // Mivel nem szeretném módosítani a tábla sorait és oszlopait,
    // ezért használtam private static final-t
    private char[][] board;
    private static final int R = 6;  // R: row - sorok száma
    private static final int C = 7; // C: column - oszlopok száma

    // for használatával meghatározzuk a táblát
    public GameBoard() {
        board = new char[R][C];
        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                board[i][j] = '.';
            }
        }
    }

    // Szintén a for használatával megjelenítem a képernyőt
    public void printBoard() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Egy boolean ellenőrzi, hogy a mozdulat érvényes-e, és ha igen,
    // letesz egy adott szimbólumot
    public boolean placeCoin(int col, char symbol) {
        if (col < 0 || col >= C || board[0][col] != '.') {
            return false; // false értéket ad vissza, ha érvénytelen a mozdulat vagy tele van a sor
        }
        for (int row = R - 1; row >= 0 ; row--) {
            if (board[row][col] == '.') {
                board[row][col] = symbol;
                return true;
            }
        }
        return false;
    }



}
