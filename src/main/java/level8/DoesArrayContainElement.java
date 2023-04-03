package level8;

import java.util.ArrayList;
import java.util.List;

public class DoesArrayContainElement {
    public static boolean check(Object[] a, Object x) {
        List<Object> list = List.of(a);
        for (Object obj : a) {
            if (obj.equals(x))
            {
                return true;

            }
        }
        return false;
    }
}
