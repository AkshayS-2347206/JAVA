import Sports.Basketball;
import Sports.Football;
import Sports.Sport;

public class Main {
    public static void main(String[] args) {
        Sport footballGame = new Football();
        footballGame.startGame();
        ((Football) footballGame).displayScore(); // Casting to Football for specific method access
        footballGame.endGame();

        Sport basketballGame = new Basketball();
        basketballGame.startGame();
        ((Basketball) basketballGame).displayScore(); // Casting to Basketball for specific method access
        basketballGame.endGame();
    }
}