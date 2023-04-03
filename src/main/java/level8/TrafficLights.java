package level8;

public class TrafficLights {
    public static String updateLight(String current) {
        switch (current) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                throw new IllegalArgumentException("Invalid traffic light state: " + current);
        }
    }

}

