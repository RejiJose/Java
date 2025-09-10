import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //Create an empty array of 25 Ball objects
    Ball[] ballList = new Ball[25];
  
    // constructor
    public GameLogic() {
      // TASK: Fill the ballList array with balls of random positions, sizes, colors and speeds. Let the balls travel from left to right and then re-start them (set y positions to zero when you get to the right border). You will need to modify the code here in the GameLogic constructor and the move() function in the Ball class.
      
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
      for(int i=0; i < ballList.length; i++){
        ballList[i].move();
      }      
    }

  
  // random #
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }


}
