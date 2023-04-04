package level8;

public class DoesArrayContainElement {
    public static boolean check(Object[] a, Object x) {
        //для кожжного об'єкта в а obj = a[i]
//        for (Object obj : a) {
//            if (obj.equals(x)) {
//                return true;
//            }
//        }
        for(int i =0;i<a.length;i++){
            Object obj = a[i];
            if (obj.equals(x)) {
                return true;
            }
        }

        return false;
    }
}
