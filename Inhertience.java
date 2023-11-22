abstract class SportsTeam{
    protected String teamName;
    protected int numberOfPlayers;

    public SportsTeam(String teamName, int numberOfPlayers)
    {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
    }

    public abstract double calculateBudget();

    public void displayTeam(){
        System.out.println("Team Name: "+ teamName);
        System.out.println("Number of Teammates: "+ numberOfPlayers);
        System.out.println("Budget: $"+ calculateBudget());
    }
}

final class FootballTeam extends SportsTeam{
    private int coaches;

    public FootballTeam(String teamName, int numberOfPlayers, int coaches)
    {
        super(teamName, numberOfPlayers);
        this.coaches = coaches;
    }

    @Override
    public double calculateBudget()
    {
        return numberOfPlayers * 10000 + coaches * 5000;
    }

    public void playGame()
    {
        System.out.println(teamName+" is playing a football match");
    }
}
    public class Inhertience
    {
        public static void main(String[] args){
            FootballTeam barcelona = new FootballTeam("Barcelona", 25, 5);
            System.out.println("$"+barcelona.calculateBudget());
            barcelona.playGame();
        }
    }

