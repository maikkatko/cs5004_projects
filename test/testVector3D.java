import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testVector3D {
  private Vector3D vector;

  @Before
  public void setUp() {
    vector = new Vector3D(3, 4, 5);
    // example of a vector
  }

  @Test
  public void testGetX() {
    double x_coordinate = vector.getX();
    assertEquals(3.0, x_coordinate, 0.001);
  }

  @Test
  public void testGetY() {
    double y_coordinate = vector.getY();
    assertEquals(4.0, y_coordinate, 0.001);
  }

  @Test
  public void testGetZ() {
    double z_coordinate = vector.getZ();
    assertEquals(5.0, z_coordinate, 0.001);
  }

  @Test
  public void testToString() {
    String expected = "(3.0,4.0,5.0)";
    assertEquals(expected, vector.toString());
  }

  @Test
  public void testGetMagnitude() {
    double magnitude = vector.getMagnitude();
    assertEquals(7.071, magnitude, 0.001);
  }
}
