import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

/**
 * This Class Call Head and Wheel class for drwaing head, neck and wheel for each player
 * This Class particular draw player body
 * @ author Satinder Singh, 000824885
 */
public class Player {
    private double x;
    private double y;
    private int average =0;
    private Color color;
    private String title;
    Head H1;
    Wheel W1,W2;
    //Random generator
    Random r = new Random();
    int r1 = r.nextInt(100);

    /**
     * This constructor just store the pass value in this class variables
     * @param x At X coordinate
     * @param y At Y coordinate
     * @param color Display body color
     */
    public Player(double x, double y, Color color){
        this.x = x;
        this.y =y;
        this.color = color;
        H1 = new Head(x+15,y-39);
        W1 = new Wheel(x-10,y-9);
        W2 = new Wheel(x+40+20,y-9);
    }

    /**
     * This constructor display Referee
     * @param x At X coordinate
     * @param y At Y coordinate
     * @param color Display body color
     * @param title name of the team
     */
    public Player(double x,double y,Color color,String title){
        this.x = x;
        this.y =y;
        this.color = color;
        this.title = "Head \n"+title;
        H1 = new Head(x+15,y-39);
        W1 = new Wheel(x-10,y-9);
        W2 = new Wheel(x+40+20,y-9);
    }

    /**
     * This method draw head , two wheel , player body and random number inside the body
     * @param gc for drawing purposes
     */
    public void draw(GraphicsContext gc){
        //For drawing Head
        H1.draw(gc);
        // For drawing body and set its color
        gc.setFill(color);
        gc.fillRect(x,y,60,40);
        // For drawing wheel left side

        W1.draw(gc);
        // For drawing wheel right side

        W2.draw(gc);
        // Set colour for win percentage of each player
        gc.setFill(Color.BURLYWOOD);
        //Choose randomly win percentage of each player
        gc.fillText(String.valueOf(r1),x+18,y+22);
        //This is for Referee
        gc.setFill(Color.RED);
        gc.fillText(title ,595,300);
    }

    /**
     * This only return win percentage of each player in a team
     * @return r1 random number
     */
    public int getAverage(){
        return r1;
    }

}
