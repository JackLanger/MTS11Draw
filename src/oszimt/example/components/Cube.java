package oszimt.example.components;

import oszimt.example.model.Vector3;

/**
 * (Is this class part of a design pattern or an implementation of a design pattern)
 * If that is the case, what pattern is in place?
 * Is this class a producer or consumer?
 * <p>
 * If the class is a utils class what kind of data or methods does it hold.
 * <p>
 * (What is Cube responsible for)
 */
public class Cube {
  private final Vector3[] cubeCorners = new Vector3[]{
      new Vector3(-1, -1, -1),
      new Vector3(-1, -1, 1),
      new Vector3(1, -1, 1),
      new Vector3(1, -1, -1),
      new Vector3(-1, 1, -1),
      new Vector3(-1, 1, 1),
      new Vector3(1, 1, 1),
      new Vector3(1, 1, -1),
  };


  private Vector3 center;
  public Cube() {
    this.center = new Vector3(0,0,0);
    
  }

  public void translate(Vector3 vec){
    for (var corner : cubeCorners) {
      corner.translate(vec);
    }
    calcCenter();
  }

  private void calcCenter() {
    center.x = (int)((cubeCorners[0].x + cubeCorners[6].x) /2.0);
    center.y = (int)((cubeCorners[3].y + cubeCorners[4].y) /2.0);
    center.z = (cubeCorners[0].z + cubeCorners[1].z)/2.0;
  }

  Vector3[] getCorners() { return cubeCorners;}
  public void scale (double scale){
    for (int i = 0; i < cubeCorners.length; i++) {
      cubeCorners[i] = cubeCorners[i].mult(scale);
    }
    calcCenter();
  }
}
