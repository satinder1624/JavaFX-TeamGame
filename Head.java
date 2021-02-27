import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class only create head and neck of each player
 * @author Satinder Singh,000824885
 */
public class Head {
    private double x;
    private double y;

    /**
     * Default constructor
     * @param x Head location a X coordinate
     * @param y Head location a Y coordinate
     */
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method is used to draw head and neck of each player
     * @param gc for drawing purposes
     */
    public void draw(GraphicsContext gc){
        // Color of Head and location
        gc.setFill(Color.GREY);
        gc.fillRect(x,y,25,25);
        // Color of Neck and location
        gc.setFill(Color.BLACK);
        gc.fillRect(x+17-9,y+25,7,14);
    }
}
