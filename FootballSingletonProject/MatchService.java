package FootballSingletonProject;


public class MatchService {

    private StadiumManager stadiumManager;

    public MatchService(StadiumManager stadiumManager) {
        this.stadiumManager = stadiumManager;
    }

    public String processTicketSale() {
        boolean success = stadiumManager.sellTicket();

        if (success) {
            return "Ticket sold successfully.";
        } else {
            return "Stadium is full. No more tickets available.";
        }
    }

    public String getMatchSummary() {
        return "Team: " + stadiumManager.getTeamName() +
               "\nCapacity: " + stadiumManager.getStadiumCapacity() +
               "\nTickets Sold: " + stadiumManager.getTicketsSold() +
               "\nRemaining Tickets: " + stadiumManager.getRemainingTickets();
    }
}
