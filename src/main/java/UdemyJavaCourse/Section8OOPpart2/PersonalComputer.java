package UdemyJavaCourse.Section8OOPpart2;

public class PersonalComputer extends ComputerFactory {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200 , 500 , "yellow");
    }
    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

   /* public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }*/
}
