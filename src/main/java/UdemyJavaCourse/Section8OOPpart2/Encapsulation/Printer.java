package UdemyJavaCourse.Section8OOPpart2.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.tonerLevel = tonerLevel <= 0 ? -1 : tonerLevel;
        this.tonerLevel = tonerLevel >= 100 ? -1 : tonerLevel;

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if (tempAmount > 100 || tempAmount < 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
