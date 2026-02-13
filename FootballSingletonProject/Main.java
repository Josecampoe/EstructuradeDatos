package FootballSingletonProject;


public class Main {

    public static void main(String[] args) {

        StadiumManager manager = StadiumManager.getInstance("Real Madrid", 2);

        MatchService matchService = new MatchService(manager);

        System.out.println(matchService.processTicketSale());
        System.out.println(matchService.processTicketSale());
        System.out.println(matchService.processTicketSale()); // Should fail (capacity reached)

        System.out.println("\nMatch Summary:");
        System.out.println(matchService.getMatchSummary());

        // Checking Singleton
        StadiumManager anotherReference = StadiumManager.getInstance("Barcelona", 50000);

        if (manager == anotherReference) {
            System.out.println("\nSingleton confirmed: Only one instance exists.");
        }
    }
}
