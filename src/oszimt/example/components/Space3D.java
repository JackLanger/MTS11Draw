package oszimt.example.components;

import oszimt.example.model.Vector3;
import oszimt.example.util.CanvasUtil;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;


public class Space3D extends JPanel {


  private Vector3 center;

  public Space3D() {
    center = new Vector3(0, 0, 0);
  }

  public void rotate(double angleX, double angleY) {

  }

  @Override
  protected void paintComponent(Graphics g) {

    super.paintComponent(g);

    drawCoordinates(g);
    Cube cube = new Cube();
    Point p = center.toScreenPoint();
    cube.scale(50);
    cube.translate(center);

    drawCube(g, cube);
  }

  private void drawCoordinates(Graphics g) {

    g.setColor(Color.GRAY);
    g.drawLine(0, CanvasUtil.CENTER_Y, CanvasUtil.WIDTH, CanvasUtil.CENTER_Y);
    g.drawLine(CanvasUtil.CENTER_X, 0, CanvasUtil.CENTER_X, CanvasUtil.HEIGTH);
  }

  private void drawCube(final Graphics g,final Cube cube) {

    final Vector3[] corners = cube.getCorners();
    g.setColor(Color.BLACK);

    IntStream.range(0, 4).parallel().forEach(start -> {
      final int target = (start + 1) % 4;
      drawLine(g, corners[start], corners[target]);
      drawLine(g, corners[start + 4], corners[target + 4]);
      drawLine(g, corners[start], corners[start + 4]);
    });
  }

  private void drawLine(final Graphics g, final Vector3 start, final Vector3 target) {

    Point first = start.toScreenPoint();
    Point second = target.toScreenPoint();
    g.drawLine(first.x, first.y, second.x, second.y);
  }

}
