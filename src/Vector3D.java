/**
 * This class represents a 3D vector. The vector has x, y, and z coordinates
 */

public class Vector3D {
  private final double x;
  private final double y;
  private final double z;

  /**
   * Constructs a Vector3D object and initializes it to the given x, y, and z
   * coordinates
   * @param x the x coordinate of the 3D vector
   * @param y the y coordinate of the 3D vector
   * @param z the z coordinate of the 3D vector
   */

  public Vector3D(double x, double y, double z){
      this.x = x;
      this.y = y;
      this.z = z;
  }

  /**
   * Get the x coordinate of the 3D vector
   * @return the x coordinate of the 3D vector
   */
  public double getX() {
    return x;
  }

  /**
   * Get the y coordinate of the 3D vector
   * @return the y coordinate of the 3D vector
   */
  public double getY() {
    return y;
  }

  /**
   * Get the z coordinate of the 3D vector
   * @return the z coordinate of the 3D vector
   */
  public double getZ() {
    return z;
  }
}
}
