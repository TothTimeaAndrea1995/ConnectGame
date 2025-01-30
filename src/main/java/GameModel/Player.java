package GameModel;

public class Player {
//    String name;
//    char symbol;
    char name;
    int symbol;

    public Player(char name, int symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public char getSymbol() {
//        return symbol;
//    }
//
//    public void setSymbol(char symbol) {
//        this.symbol = symbol;
//    }
}