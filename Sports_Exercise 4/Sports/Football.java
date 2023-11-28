package Sports;

public class Football implements Sport {
    private int homeTeamScore;
    private int awayTeamScore;

    @Override
    public void startGame() {
        // Logic to start a football game
        System.out.println("Football game started");
    }

    @Override
    public void endGame() {
        // Logic to end a football game
        System.out.println("Football game ended");
    }

    @Override
    public void displayScore() {
        System.out.println("Football Score:");
        System.out.println("Home: " + homeTeamScore + " - Away: " + awayTeamScore);
    }

}
