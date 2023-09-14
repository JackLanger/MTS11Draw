package oszimt.example.util;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * (Is this class part of a design pattern or an implementation of a design pattern)
 * If that is the case, what pattern is in place?
 * Is this class a producer or consumer?
 * <p>
 * If the class is a utils class what kind of data or methods does it hold.
 * <p>
 * (What is CanvasUtil responsible for)
 */
public class CanvasUtil {
  public final static int WIDTH = 1200;
  public final static int HEIGTH = 800;
  public static final int CENTER_Y = HEIGTH/2;
  public static final int CENTER_X = WIDTH/2;
  public static final Point2D CENTER = new Point(CENTER_X,CENTER_Y);
}
