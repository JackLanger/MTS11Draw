package oszimt.example.model;

import jdk.jshell.spi.ExecutionControl;
import oszimt.example.util.CanvasUtil;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * (Is this class part of a design pattern or an implementation of a design pattern)
 * If that is the case, what pattern is in place?
 * Is this class a producer or consumer?
 * <p>
 * If the class is a utils class what kind of data or methods does it hold.
 * <p>
 * (What is Vector3 responsible for)
 */
public class Vector3 extends Point {
  private final static double HALF = .5;
  public double z;

  public Vector3(double x, double y, double z) {
    super((int) x, (int) y);
    this.z = z;
  }

  public Vector3 mult(double val) {
    return new Vector3(val * x, val * y, val * z);
  }

  public Vector3 mult(double x, double y) {
    return new Vector3(this.x * x, this.y * y, (x + y) / 2 * z);
  }

  public Vector3 mult(double x, double y, double z) {
    return new Vector3(this.x * x, this.y * y, this.z * z);
  }

  @Override
  public double getX() { return y - HALF * x; }

  @Override
  public double getY() {
    return z + HALF * x;
  }

  public static Vector3 toVector(Point2D point) throws ExecutionControl.NotImplementedException {
    throw new ExecutionControl.NotImplementedException("not yet implemented");
  }

  public Point toScreenPoint() {

    return new Point(CanvasUtil.CENTER_X - (int) getX(), CanvasUtil.CENTER_Y - (int) getY());
  }

  public void translate(Vector3 vec) {
    this.x += vec.x;
    this.y += vec.y;
    this.z += vec.z;
  }

  public Vector3 add(Vector3 v) {
    return new Vector3(x + v.x, y + v.y, z + v.z);
  }


}
