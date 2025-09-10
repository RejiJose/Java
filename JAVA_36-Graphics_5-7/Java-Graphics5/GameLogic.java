import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //Create an empty array of 25 Ball objects
    Ball[] ballList = new Ball[25];
  
    // constructor
    public GameLogic() {
      // Populate(fill) the ballList using a for loop
      for(int i=0; i<ballList.length; i++){
        //generate a random color using RGB
        Color color = new Color(randInt(0,255),
                                randInt(0,255),
                                randInt(0,255) );
        // create a ball
        Ball ball = new Ball(randInt(0,Game.width),//x
                             randInt(0,Game.height), //y
                             0, //dx
                             randInt(1,5),//dy
                             randInt(5,30),//diameter(width & height)
                             color);
        //add the ball to the array
        ballList[i] = ball;
      }
    }
  
    public void gameLoop(){
      //move each ball in the list
      // ballList[0].move();
      // ballList[1].move(); // and so on, for each ball
      
      for(int i=0; i<ballList.length; i++){
        ballList[i].move();
      }
      
    }



    // random #
    int randInt(int lower, int upper){
      int range = upper - lower + 1;
      return (int)(Math.random()*range) + lower;
    }


}
