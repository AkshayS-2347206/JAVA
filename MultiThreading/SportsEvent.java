
public class SportsEvent {
    public static void main(String[] args) {
        Athlete athlete1 = new Athlete("Michael");
        Athlete athlete2 = new Athlete("Serena");

        Coach coach1 = new Coach("Coach Alex");
        Coach coach2 = new Coach("Coach Emily");

        athlete1.start();
        athlete2.start();
        coach1.start();
        coach2.start();

        try {
            athlete1.join();
            athlete2.join();
            coach1.join();
            coach2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All athletes are ready to compete, and coaches have finished guiding.");
    }
}
