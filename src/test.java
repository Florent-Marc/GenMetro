
import java.awt.*;

public class test {

    public static void main(String[] args) {

// Create a frame

        Frame frame = new Frame();

// Add a component with a custom paint method

        frame.add(new CustomPaintComponent());

// Display the frame

        int frameWidth = 300;

        int frameHeight = 300;

        frame.setSize(frameWidth, frameHeight);

        frame.setVisible(true);

    }

    /**
     * To draw on the screen, it is first necessary to subclass a Component
     * and override its paint() method. The paint() method is automatically called
     * by the windowing system whenever component's area needs to be repainted.
     */
    static class CustomPaintComponent extends Component {

        public void paint(Graphics g) {

            // Retrieve the graphics context; this object is used to paint shapes

            Graphics2D g2d = (Graphics2D)g;

            // Draw an oval that fills the window

            int x = 0;

            int y = 0;

            int w = getSize().width-1;

            int h = getSize().height-1;



            Polygon polygon = new Polygon();

            polygon.addPoint(w/4, h/2);

            polygon.addPoint(0, h/2);

            polygon.addPoint(w/4, 3*h/4);

            polygon.addPoint(w/2, 3*h/4);
            polygon.addPoint(3*w/4, h/3);

            //set color to green
            g2d.setColor(java.awt.Color.green);
            //fill with red
            g2d.fillPolygon(polygon);
            //set color to black
            g2d.setColor(Color.RED);

            // Add more points...
            g2d.drawPolygon(polygon);

        }

    }

}