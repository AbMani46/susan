package susan;

import org.w3c.dom.css.Rect;

import java.util.*;

///  number 10
public class ArrayRectSorty {
    public static void main(String[] args) {

        Rectangle[] rects = {new Rectangle(5, 6), new Rectangle(5, 7), new Rectangle(5, 8), new Rectangle(1,2)};

        rects = ArrayRectSorty.sort(rects);
        for (Rectangle rect: rects){
            System.out.println(rect);
        }

    }

    public static Rectangle[] sort(Rectangle[] rects){
        TreeSet<Rectangle> treeset = new TreeSet<Rectangle>(new PerimeterComparator());
        treeset.addAll(Arrays.asList(rects));;
        return treeset.toArray(new Rectangle[treeset.size()]);

    }
}
