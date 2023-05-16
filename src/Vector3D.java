import java.lang.Math;

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
   * @return a double representing the x coordinate of the 3D vector
   */
  public double getX() {
    return x;
  }

  /**
   * Get the y coordinate of the 3D vector
   * @return a double representing the y coordinate of the 3D vector
   */
  public double getY() {
    return y;
  }

  /**
   * Get the z coordinate of the 3D vector
   * @return a double representing the z coordinate of the 3D vector
   */
  public double getZ() {
    return z;
  }

  /**
   * Returns a string representation of the 3D Vector with x, y, and z
   * coordinates
   * @return a formatted string
   */
  public String toString() {
    /*
      Fields:
      this.x: double
      this.y: double
      this.z: double
     */
    String s_x = Double.toString(this.x);
    String s_y = Double.toString(this.y);
    String s_z = Double.toString(this.z);

    return "(" + s_x + "," + s_y + "," + s_z + ")";
  }

  /**
   * Returns a double representing the magnitude of the vector
   * @return a double representing the magnitude of the vector
   */
  public double getMagnitude() {
    double x_sq = Math.pow(this.x, 2);
    double y_sq = Math.pow(this.y, 2);
    double z_sq = Math.pow(this.z, 2);
    return Math.sqrt(x_sq + y_sq + z_sq);
  }

  /**
   * Returns a String representing the normalized vector
   * @return a String representing the normalized vector
   */
  public String normalize(Vector3D vector) {
    double v_mag = vector.getMagnitude();
    if (this.x == 0) {
      double x_norm = 0;
    } else {
      double x_norm = this.x / v_mag;
    }

    if (this.y == 0) {
      double y_norm = 0;
    } else {
      double y_norm = this.y / v_mag;
    }

    if (this.z == 0) {
      double z_norm = 0;
    } else {
      double z_norm = this.z / v_mag;
    }

    return ;
  }

  /**
   * Returns a double representing the sum of vectors
   * @return a double representing the sum of vectors
   */
  public double add(Vector3D vector) {
    double x_sum = this.x + vector.x;
    double y_sum = this.y + vector.y;
    double z_sum = this.z + vector.z;

    return :
  }

  /**
   * Returns a double representing the result of multiplying the vector by a
   * constant
   * @param multi a double representing the multiplier
   * @return a double representing the result of multiplying the vector by a
   * constant
   */
  public double multiply(double multi) {
    double x_multi = this.x * multi;
    double y_multi = this.y * multi;
    double z_multi = this.z * multi;

    return
  }

  /**
   * Returns the dot product between this vector and another
   * @param vector a Vector3D object that we can multiply the vector by
   * @return a
   */
  public double dotProduct(Vector3D vector) {
    double x_dot = this.x * vector.x;
    double y_dot = this.y * vector.y;
    double z_dot = this.z * vector.z;

    return x_dot + y_dot + z_dot;
  }

  /**
   * Returns the angle between two vectors
   * @param vector a Vector3D object that represents the vector to copmare to
   * @returns a double representing the angle between the two vectors
   */
  public double angleBetween(Vector3D vector) {
    double v1_mag = this.getMagnitude();
    double v2_mag = vector.getMagnitude();

    return (this.dotProduct(vector)/(v1_mag*v2_mag));
  }
}
