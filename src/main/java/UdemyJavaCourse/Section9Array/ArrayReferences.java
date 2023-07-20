package UdemyJavaCourse.Section9Array;

public class ArrayReferences {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        int[] secondArr =  myArr;
            modifyArr(myArr);

    }
    private static void modifyArr(int[] array ){
        array[1]= 2;

    }
}
