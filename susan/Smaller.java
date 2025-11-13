package susan;

public class Smaller<E extends GeometricObject> {

    public static<E extends GeometricObject> E min(E g1, E g2, PerimeterComparator<E> pc){
      int val = pc.compare(g1, g2);
      if(val==0){
          return g1;
      }
      else if(val<0){
          return g1;
      }
      else{
          return g2;
      }
    }

    public static void main(String[] args) {
        Rectangle rect = (Rectangle) Smaller.min(new Rectangle(1,2), new Rectangle(5,6), new PerimeterComparator<Rectangle>());
        System.out.println(rect);
    }
}
