package oszimt.example;

import javax.swing.JFrame;
import javax.swing.JPanel;

import oszimt.example.components.Space3D;
import oszimt.example.util.CanvasUtil;

import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Cubicle Mesh");
        JPanel cube = new Space3D();

        cube.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(CanvasUtil.WIDTH, CanvasUtil.HEIGTH);
        frame.setLocation( CanvasUtil.CENTER_X/2  ,CanvasUtil.CENTER_Y/3 );

        frame.add(cube);
        frame.setVisible(true);
    }
}
