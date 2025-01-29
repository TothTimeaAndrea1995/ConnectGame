package GameModel;

import java.util.Scanner;

//Meghatároztam a játékosokat és behívtam a táblát
public class setGame {
    GameBoard gameBoard; //játéktábla
    Player playerOne; //Első játékos
    Player playerTwo; //Második játékos
    Player currentPlayer; //Jelenlegi játékos

    //Amelyik játékos következik, hozzátartozó szimbólumot kap
    //A kezdő játékos mindig az Első játékos
    public setGame() {
        gameBoard = new GameBoard();
        playerOne = new Player("Első játékos", 'X');
        playerTwo = new Player("Második játékos", 'O');
        currentPlayer = playerOne;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            gameBoard.printBoard();
            System.out.println(currentPlayer.getName() + "következik (tegyél egy" + currentPlayer.getSymbol() + "jelet");
            System.out.println("Kérek egy számot (0-6): ");
            int col = scanner.nextInt();

            if (!gameBoard.placeCoin(col, currentPlayer.getSymbol())) {
                System.out.println("Érvénytelen lépés! Próbáljuk még egyszer.");
                continue;
            }

            //if (gameBoard.checkWin(currentPlayer.getSymbol())) {
              //  gameBoard.printBoard();
                //System.out.println(currentPlayer.getName() + " győzött!");
                //break;
            //}

            currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
        }
    }

}
