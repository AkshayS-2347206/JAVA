
class Sports {

    // data members
    private String sportsName;
    private int numberOfPlayer;

    public Sports() {
        sportsName = "unknown";
        numberOfPlayer = 0;
    }

    // parameterised constructor
    public Sports(String sportsName, int numberOfPlayer) {
        this.sportsName = sportsName;
        this.numberOfPlayer = numberOfPlayer;
    }

    // method overloading
    public void sportsDetails(String sportsName) {
        this.sportsName = sportsName;
    }

    public void sportsDetails(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void sportsDetails(String sportsName, int numberOfPlayer) {
        this.sportsName = sportsName;
        this.numberOfPlayer = numberOfPlayer;
    }

    public void display() {
        System.out.println("Sports Name: " + sportsName);
        System.out.println("number of Players: " + numberOfPlayer);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Sports cricket = new Sports("Cricket", 11);
        Sports football = new Sports();

        System.out.println("Cricket Details");
        cricket.display();

        System.out.println("Football Details: ");
        football.display();

    }
}