import java.util.ArrayList;
import java.util.List;

class Player {
    int playerID;
    String name;
    int age;
    float salary;

    public Player(int playerID, String name, int age, float salary) {
        this.playerID = playerID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class SportsManagement {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player(1, "Player1", 25, 50000));
        players.add(new Player(2, "Player2", 22, 60000));
        players.add(new Player(3, "Player3", 28, 45000));
        players.add(new Player(4, "Player4", 30, 75000));
        players.add(new Player(5, "Player5", 26, 55000));

        players.sort((p1, p2) -> {
            if (p1.salary < p2.salary) {
                return -1;
            } else if (p1.salary > p2.salary) {
                return 1;
            } else {
                return 0;
            }
        });

        for (Player player : players) {
            System.out.println("ID: " + player.playerID +
                    ", Name: " + player.name +
                    ", Age: " + player.age +
                    ", Salary: " + player.salary);
        }
    }
}
