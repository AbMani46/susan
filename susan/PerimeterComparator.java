package susan;

import java.util.Comparator;

public class PerimeterComparator<E extends GeometricObject> implements Comparator<E> {

    @Override
    public int compare(E e, E t1) {
        return Double.compare(e.getPerimeter(), t1.getPerimeter());
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

}
