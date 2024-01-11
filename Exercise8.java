import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class SportManagementSystem {
    private ArrayList<String> players;

    private HashMap<String, String> performanceRecords;

    private LinkedList<String> gameSchedules;

    public SportManagementSystem() {
        players = new ArrayList<>();
        performanceRecords = new HashMap<>();
        gameSchedules = new LinkedList<>();
    }

    public void addPlayer(String playerName) {
        players.add(playerName);
    }

    public void addPerformanceRecord(String playerName, String performanceInfo) {
        performanceRecords.put(playerName, performanceInfo);
    }

    public void scheduleGame(String playerName, String gameDetails) {
        gameSchedules.add(playerName + ": " + gameDetails);
    }

    public void displayPlayers() {
        System.out.println("Players:");
        for (String player : players) {
            System.out.println(player);
        }
    }

    public void displayPerformanceRecords() {
        System.out.println("Performance Records:");
        for (Map.Entry<String, String> entry : performanceRecords.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayGameSchedules() {
        System.out.println("Game Schedules:");
        for (String gameSchedule : gameSchedules) {
            System.out.println(gameSchedule);
        }
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        SportManagementSystem sportManagementSystem = new SportManagementSystem();

        sportManagementSystem.addPlayer("Player1");
        sportManagementSystem.addPlayer("Player2");

        sportManagementSystem.addPerformanceRecord("Player1", "Goals Scored: 10, Assists: 5");
        sportManagementSystem.addPerformanceRecord("Player2", "Goals Scored: 5, Assists: 3");

        sportManagementSystem.scheduleGame("Player1", "Football Match");
        sportManagementSystem.scheduleGame("Player2", "Basketball Game");

        sportManagementSystem.displayPlayers();
        sportManagementSystem.displayPerformanceRecords();
        sportManagementSystem.displayGameSchedules();
    }
}