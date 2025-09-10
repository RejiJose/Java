import java.awt.*;
import javax.swing.*;
/*
TASK: Create a game that has:
- 15 balls, each of different color, speed and size; going from left to right
- 15 balls, each of different color, speed and size; going from top to bottom

The goal of the game is to avoid having the mouse hit any of the balls. Keep a count on the screen of the number of times the mouse was hit by a ball.
  */

public class GameLogic {
    // String to display collisions of mouse with ball
    String text ="";

    //Create an empty array of 30 Ball objects
    Ball ball ;
  
    public GameLogic() {
      // Initiate the ball object variables (use a for loop)
	  ball = new Ball(50,50,0,1,60,Color.green);
	  
    }
  
    public void gameLoop(){
      
	  // move each ball in the array
	  ball.move();
	  
	  // increment count of collisions of any ball with mouse
	  
	  
	  // display # of collisions   
      text = "Collisions: ";
      Game.canvas.drawString(text, 20, 20);
      
      

    }


  
    // random #
    int randInt(int lower, int upper){
      int range = upper - lower + 1;
      return (int)(Math.random()*range) + lower;
    }

}
