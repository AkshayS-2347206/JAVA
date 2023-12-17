public class Coach extends Thread {
    private String coachName;

    public Coach(String name) {
        this.coachName = name;
    }

    public void run() {
        System.out.println("Coach " + coachName + " is strategizing and guiding the team.");

        try {
            Thread.sleep(2000); // Simulating coaching time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Coach " + coachName + " has finished coaching.");
    }
}