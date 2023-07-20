package UdemyJavaCourse.Section7OOP.Inheritance;

public class BarcelonaTeam extends FootballTeams {
    private String stadium;
    private String city;

    public String getStadium() {
        return stadium;
    }

    public String getCity() {
        return city;
    }

    public BarcelonaTeam(String country, String players, String coach, String stadium, String city) {
        super(country, players, coach);
        this.stadium = stadium;
        this.city = city;
    }

    @Override
    public void training() {
        super.training();
        System.out.println("Barcelona footbal team doing well in training");
        driblling();
    }

    @Override
    public void driblling() {
        super.driblling();
        System.out.println(getPlayers() + " doing well");

    }

    @Override
    public String toString() {
        return "BarcelonaTeam{" +
                "stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                " " + super.toString() + "}";
    }
}
