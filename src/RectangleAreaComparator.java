import java.util.Comparator;

public class RectangleAreaComparator implements Comparator<Rectangle> {

  @Override
  public int compare(Rectangle o1, Rectangle o2) {
    double area1 = o1.getArea();
    double area2 = o2.getArea();

    if (area1 < area2) return -1;
    else if (area1 > area2) {
      return 1;
    } else {
      return 0;
    }
  }
}
