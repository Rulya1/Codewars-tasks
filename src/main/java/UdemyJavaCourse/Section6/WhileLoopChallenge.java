package UdemyJavaCourse.Section6;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int StartingNumber = 4;
        int finishNumber = 20;
        int oddCount = 0;
        int evenCount = 0;
        while (StartingNumber <= finishNumber) {
            StartingNumber++;
            if (!isEvenNumber(StartingNumber)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number = " + StartingNumber);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }
        System.out.println("total Even numbers = " + evenCount);
        System.out.println("Total odd numbers = " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else
            return false;
    }
}
