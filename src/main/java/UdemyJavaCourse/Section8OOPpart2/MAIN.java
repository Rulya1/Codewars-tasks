package UdemyJavaCourse.Section8OOPpart2;

public class MAIN {
    public static void main(String[] args) {
        ComputerCase thecase = new ComputerCase("2208" ,"Dell" , "240");
        Monitor monitor = new Monitor("27ihc Beast" , "acer" , 27 , "1780x1200");
        Motherboard motherboard = new Motherboard("BJ - 299" , "Asus" ,
                4 , 6 , "v3.11");
         PersonalComputer pc = new PersonalComputer("2208" , "Dell" ,
                 thecase , monitor , motherboard);
//         pc.getMonitor().drawPixelAt(10 , 10 ,"red");
//         pc.getMotherboard().loadProgram("Windows 10");
//         pc.getComputerCase().pressPowerButton();
        pc.powerUp();
    }
}
