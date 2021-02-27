import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class only create wheel of each player
 */
public class Wheel {
    private double x;
    private double y;

    /**
     * Default constructor
     * @param x At X coordinates
     * @param y At Y coordinates
     */

    public Wheel(double x,double y){
        this.x = x;
        this.y = y;
    }

    /**
     * This method draw wheel for each player
     * @param gc for drawing purposes
     */
    public void draw(GraphicsContext gc){
        // Color of each wheel and location
        gc.setFill(Color.BLUE);
        gc.fillOval(x,y,10,60);
    }
}
