public class Athlete extends Thread {
    private String athleteName;

    public Athlete(String name) {
        this.athleteName = name;
    }

    public void run() {
        System.out.println("Athlete " + athleteName + " is preparing for the event.");

        try {
            Thread.sleep(3000); // Simulating preparation time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Athlete " + athleteName + " is ready to compete.");
    }
}