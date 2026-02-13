package FootballSingletonProject;


public class StadiumManager {

    private static StadiumManager instance;

    private String teamName;
    private int stadiumCapacity;
    private int ticketsSold;

    // Private constructor
    private StadiumManager(String teamName, int stadiumCapacity) {
        this.teamName = teamName;
        this.stadiumCapacity = stadiumCapacity;
        this.ticketsSold = 0;
    }

    // Singleton access method
    public static StadiumManager getInstance(String teamName, int stadiumCapacity) {
        if (instance == null) {
            instance = new StadiumManager(teamName, stadiumCapacity);
        }
        return instance;
    }

    // Business logic method
    public boolean sellTicket() {
        if (ticketsSold < stadiumCapacity) {
            ticketsSold++;
            return true;
        } else {
            return false;
        }
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int getRemainingTickets() {
        return stadiumCapacity - ticketsSold;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }
}
