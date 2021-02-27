import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * This class create the one whole team with players with the help of wheel, head and player class by calling them
 * @author Satinder Singh, 000824885
 */
public class Team {
    private double x;
    private double y;
    private String name;
    private Color color;
    Player P1,P2,P3;
    //Follows are static variables. I choose that because user can only think about team name and color the location
    //Can be set according to the number of teams. It means after creating one team it automatically sets the location
    //to display information at equally space


    private static int yP = 50;                          // Coordinates to display particular Team Players at Y

    /**
     * After Creating one Team it add fixed coordinates for Y to next one
     * @param name Taking Team name
     * @param color Taking Team color
     */
    public Team(String name,  Color color, double x, double y){
    this.name = name;
    this.x = x;
    this.y = y;
    this.color = color;
    P1 = new Player(50,yP,color);
    P2 = new Player(50+120,yP,color);
    P3 = new Player(50+120+120,yP,color);
    }

    /**
     * This method draw Team name, average, set color and call the player class to draw player of particular team
     * @param gc for draw purposes
     */
    public void draw (GraphicsContext gc){
        //Body color
        gc.setFill(color);
        //Set Font Size and style
        gc.setFont(new Font("System",20));
        //Write Team name and average at x and y
        gc.fillText("Team "+name+" Average: ",x,y);

        //Call draw method of player class to draw a Player and it take fixed x , y coordinates and color as xP , yP and color

        P1.draw(gc);

        P2.draw(gc);

        P3.draw(gc);
        //Increment yP for Y coordinate of player after creating one team
        yP += 150;
        //Set color for average
        gc.setFill(Color.RED);
        //Calculating and display average of Team at X and Y coordinates
        gc.fillText(String.valueOf((P1.getAverage()+P2.getAverage()+P3.getAverage())/3),x+250,y);

    }
}
