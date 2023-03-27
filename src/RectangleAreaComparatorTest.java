import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;
import static org.junit.Assert.assertEquals;

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
    Collections.sort(rectangles, new RectangleAreaComparator());

    assertEquals(r3, rectangles.get(0));
    assertEquals(r2, rectangles.get(1));
    assertEquals(r1, rectangles.get(2));
  }
}
