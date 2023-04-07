package level7;

public class AreOfPerimeter {
    public static int areaOrPerimeter (int l, int w) {

        if (l == w) { // square
            return l * l;
        } else {
            return 2 * (l + w); // perimeter
    }
}
}
