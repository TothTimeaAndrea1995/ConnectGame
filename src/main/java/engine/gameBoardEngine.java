package engine;

import GameModel.GameBoard;
import GameModel.Player;
import exceptions.exception;

public class gameBoardEngine {
    char R = GameBoard.getR();
    char C = GameBoard.getC();
    GameBoard board;
    char[][] arr;

    public gameBoardEngine(GameBoard board) {
        this.board = board;
        R = GameBoard.getR();
        C = GameBoard.getC();
        arr = board.getGameBoard();
    }

//    public void GameBoard() {
//        board = new char[R][C];
//        for(int i=0; i<R; i++) {
//            for(int j=0; j<C; j++) {
//                board[i][j] = '.';
//            }
//        }
//    }

    public boolean boardFull() {
        boolean emptyBoard = false;
        for(int i=0; i<R; i++) {
            if (arr[0][i] == 0){
                emptyBoard = true;
                break;
            }
        }
        return !emptyBoard;
    }

    public void player(Player player) throws exception {
        int symbol = player.getSymbol();
        int row = 0;
        while (row < R && arr[row][symbol] == 0) {
            row++;
        }
        if (row == R) {
            arr[R - 1][symbol] = (char) player.getName();
        } else {
            if (!(arr[0][symbol] == 0)) {
                throw new exception();
            } else {
                arr[row - 1][symbol] = player.getName();
            }
        }
    }

    //Ellenőrizzük, hogy ki nyert
    public boolean checkWin(char symbol, int row, int col) {
        return  checkDirection(row, col, symbol, 1, 0) //Vízszintesen
            || checkDirection(row, col, symbol, 0, 1) //Függőlegesen
            || checkDirection(row, col, symbol, 1, 1) //Átlós \
            || checkDirection(row, col, symbol, 1, -1); //Átlós /
    }

    private boolean checkDirection(int row, int col, char symbol, int rowDir, int colDir) {
       int count = 1;
       count += countMatches(row, col, symbol, rowDir, colDir); //Előre ellenőriz
       count += countMatches(row, col, symbol, -rowDir, -colDir); //Visszafelé ellenőriz
       return count >= 4; //4 vagy több azonos jel van egy sorban, a játékos nyert
    }

    private int countMatches(int row, int col, char symbol, int rowDir, int colDir) {
        int r = row + rowDir;
        int c = col + colDir;
        int count = 0;

//        while (r >= 0 && r < R && c >= 0 && c < C && board[r][c] == symbol) {
//            count++;
//            r += rowDir;
//            c += colDir;
//        }
        return count;
    }





}
