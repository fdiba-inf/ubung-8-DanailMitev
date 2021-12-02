package exercise8;
import java.util.Scanner;

public class Point {
  double x;
  double y;
    // Define attributes

    public Point() {
      x = 0;
      y = 0;

        // Initialize attributes to 0
    }

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
        // Initialize attributes by coping x and y parameters
    }

    public Point(Point otherPoint) {
      this.x = otherPoint.x;
      this.y = otherPoint.y;
        // Initialize attributes by coping attributes of otherPoint
    }

    public void initialize() {
      x = Utils.INPUT.nextDouble();
      y = Utils.INPUT.nextDouble();
        // Change attributes through console
    }

    public void translate(double xDelta, double yDelta) {
      this.x = x + xDelta;
      this.y = y + yDelta;
        // Change attributes by adding xDelta and yDelta
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
      Point np = new Point();
      np.x = x + xDelta;
      np.y = y + yDelta;
        // Create new point which is translated relative to this point
    return np;
    }

    public boolean equals(Point otherPoint) {
      if (this.x == otherPoint.x && this.y == otherPoint.y) {
        return true;
      } else {
        return false;
      }
        // Compare attributes of this point to attributes of otherPoint for equalit
    }

    public String toString() {

        // Represent attributes as string
        return "(" + x + ", " + y + ")";
    }
}
