package level8;

public class DoesArrayContainElement {
    public static boolean check(Object[] a, Object x) {
        for (Object obj : a) {
            if (obj.equals(x))
            {
                return true;

            }
        }
        return false;
    }
}
