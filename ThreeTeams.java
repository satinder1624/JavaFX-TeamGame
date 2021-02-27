import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.util.Random;
/**
 * This class create 4 Teams and choose one Head Referee Randomly
 * Each team has 3 players with a average percentage of win inside their body
 * It also display the Team name and average win percentage
 * @author Satinder Singh, 000824885
 */
public class ThreeTeams extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(700, 600); // Set canvas Size in Pixels
        stage.setTitle("ROBOTS!!!!!!"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 

        //Creating a  object of team which gets two parameters team name and team color and call the draw method which
        //draw team players.
        Team T1 = new Team("India", Color.DARKORCHID,50,130);
        T1.draw(gc);
        Team T2 = new Team("Australia", Color.BLACK,50,280);
        T2.draw(gc);
        Team T3 = new Team("England", Color.DARKGREEN,50,430);
        T3.draw(gc);
        Team T4 = new Team("Canada", Color.DARKCYAN,50,580);
        T4.draw(gc);

        //referee object of Random class which generate random number between 0 to 3 and store at r
        Random referee = new Random();
        int r = referee.nextInt(4);

        switch(r){
            case 0:
                // Draw player of first team if random number is 0
                Player P1 = new Player(600,225,Color.DARKORCHID,"India");
                P1.draw(gc);
                break;
            case 1:
                // Draw player of second team if random number is 1
                Player P2 = new Player(600,225,Color.BLACK,"Australia");
                P2.draw(gc);
                break;
            case 2:
                // Draw player of third team if random number is 2
                Player P3 = new Player(600,225,Color.DARKGREEN,"England");
                P3.draw(gc);
                break;
            case 3:
                // Draw player of fourth team if random number is 3
                Player P4 = new Player(600,225,Color.DARKCYAN,"Canada");
                P4.draw(gc);
                break;
            default:
                break;

        }
        // YOUR CODE STOPS HERE
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
