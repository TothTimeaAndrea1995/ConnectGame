package GameModel;

import java.util.Scanner;

//Meghatároztam a játékosokat és behívtam a táblát
public class setGame {

    //    GameBoard gameBoard; //játéktábla
//    Player playerOne; //Első játékos
//    Player playerTwo; //Második játékos
//    Player currentPlayer; //Jelenlegi játékos

    //Amelyik játékos következik, hozzátartozó szimbólumot kap
    //A kezdő játékos mindig az Első játékos
//    public setGame() {
//        gameBoard = new GameBoard();
//        playerOne = new Player("Első játékos", 'X');
//        playerTwo = new Player("Második játékos", 'O');
//        currentPlayer = playerOne;
//    }

//    public void startGame() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            gameBoard.printBoard();
//            System.out.println(currentPlayer.getName() + "következik (tegyél egy" + currentPlayer.getSymbol() + "jelet");
//            System.out.println("Kérek egy számot (0-6): ");
//            int col = scanner.nextInt();
//
//            if (!gameBoard.placeCoin(col, currentPlayer.getSymbol())) {
//                System.out.println("Érvénytelen lépés! Próbáljuk még egyszer.");
//                continue;
//            }
//
//            //if (gameBoard.checkWin(currentPlayer.getSymbol())) {
//              //  gameBoard.printBoard();
//                //System.out.println(currentPlayer.getName() + " győzött!");
//                //break;
//            //}
//
//            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
//        }
//    }

    GameBoard gameBoard;
    int playerOne = 1;
    int playerTwo = 1;
    String name;

    public setGame(GameBoard gameBoard,
                   int playerOne, int playerTwo,
                   String name) {
        this.gameBoard = gameBoard;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.name = name;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public int getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(int playerOne) {
        this.playerOne = playerOne;
    }

    public int getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(int playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

