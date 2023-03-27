import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RectangleAreaComparatorTest {

  @Test
  public void testComparator() {
    Rectangle r1 = new Rectangle(4, 5);
    Rectangle r2 = new Rectangle(3, 6);
    Rectangle r3 = new Rectangle(2, 8);

    List<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(r1);
    rectangles.add(r2);
    rectangles.add(r3);


    // Сортируем прямоугольники по площади
    rectangles.sort(new RectangleAreaComparator());

    Assertions.assertEquals(r3, rectangles.get(0));
    Assertions.assertEquals(r2, rectangles.get(1));
    Assertions.assertEquals(r1, rectangles.get(2));
  }
}
