package Sports;

public class Basketball implements Sport {
    private int teamAScore;
    private int teamBScore;

    @Override
    public void startGame() {
        // Logic to start a basketball game
        System.out.println("Basketball game started");
    }

    @Override
    public void endGame() {
        // Logic to end a basketball game
        System.out.println("Basketball game ended");
    }

    @Override
    public void displayScore() {
        System.out.println("Basketball Score:");
        System.out.println("Team A: " + teamAScore + " - Team B: " + teamBScore);
    }

    // Other basketball-specific methods can be added here
}