package UdemyJavaCourse.Section7OOP.Inheritance;

public class FootballTeams {
    private String country;
    private String players;
    private String coach;

    public String getCountry() {
        return country;
    }

    public String getPlayers() {
        return players;
    }

    public String getCoach() {
        return coach;
    }

    public FootballTeams(){}
    public FootballTeams(String country, String players, String coach) {
        this.country = country;
        this.players = players;
        this.coach = coach;
    }
    public void training(){
        driblling();
        physicalActivity();
        runTo100Meters();
        bumpsOnCorner();
    }


    public void driblling(){
        System.out.println("Players practicing driblling");
    }
    public void physicalActivity(){
        System.out.println("PLayers doing physical tasks ");
    }
    public void runTo100Meters(){
        System.out.println("Players running");
    }
    public void bumpsOnCorner(){
        System.out.println("Players practicing bumps on corner");
    }

    @Override
    public String toString() {
        return
                "country='" + country + '\'' +
                ", players='" + players + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}

