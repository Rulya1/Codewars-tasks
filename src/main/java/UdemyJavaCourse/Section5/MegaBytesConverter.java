package UdemyJavaCourse.Section5;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            int megaBytes = kiloBytes / 1024;
            int Reminder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + Reminder + " KB");
        }
     }
}
