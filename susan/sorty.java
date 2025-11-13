package susan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

///  number 11
public class sorty {

    public static void main(String[] args) {

        ArrayList<Rectangle> rects = new ArrayList<>(List.of(new Rectangle(5, 6), new Rectangle(5, 7), new Rectangle(5, 8), new Rectangle(1,2)));

        Collections.sort(rects, new PerimeterComparator<Rectangle>());

        rects.sort(new PerimeterComparator<Rectangle>());

        System.out.println(rects);

    }
}
