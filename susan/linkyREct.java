package susan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

///  number 8
public class linkyREct {
    public static void main(String[] args) {
        Rectangle[] rects = {new Rectangle(2,3), new Rectangle(1,2), new Rectangle(3,4), new Rectangle(5,6)};
        LinkedList<Rectangle> list = new LinkedList<>(Arrays.asList(rects));

        ListIterator<Rectangle> listIterator = list.listIterator();
for(int i = 0;i<list.size();i++){
    listIterator.next();
}
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous().getArea());
        }
    }


}
