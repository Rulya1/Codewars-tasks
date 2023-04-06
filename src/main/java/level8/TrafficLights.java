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
               return "error";
        }
    }

}
//https://www.codewars.com/kata/58649884a1659ed6cb000072

