package startGame;

import java.util.Random;
import java.util.Scanner;

import exceptions.exception;
import GameModel.GameBoard;
import GameModel.setGame;
import GameModel.Player;
import engine.gameBoardEngine;

public class startGame {
    setGame setGame;
    gameBoardEngine gameBoardEngine;

    public startGame() {
        GameBoard gameBoard = new GameBoard();
        setGame = new setGame(gameBoard, 1, 1, "");
        gameBoardEngine = new gameBoardEngine(gameBoard);
    }

    public setGame getSetGame() {
        return setGame;
    }

    public gameBoardEngine getGameBoardEngine() {
        return gameBoardEngine;
    }

    public void setGameBoardEngine(gameBoardEngine gameBoardEngine) {
        this.gameBoardEngine = gameBoardEngine;
    }

    public void printBoard() {
        char[][] gameBoard = setGame.getGameBoard().getGameBoard();
        for (char i = 0; i < GameBoard.getR(); i++) {
            for (char j = 0; j < GameBoard.getC(); j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void runGame() {
        Scanner scanner= new Scanner(System.in);
        printBoard();
    }
}
