import java.awt.*;
import javax.swing.*;
/*
TASK: Create a game that has:
- 15 balls, each of different color, speed and size; going from left to right
- 15 balls, each of different color, speed and size; going from top to bottom

The goal of the game is to avoid having the mouse hit any of the balls. Keep a count on the screen of the number of times the mouse was hit by a ball.
*/

public class GameLogic {
    
    String text =""; // String to display collisions of mouse with ball
	int count = 0; // counts # of collisions

    //Create an empty array of 30 Ball objects
    Ball[] ballList = new Ball[30];
  
    public GameLogic() {      
	  // Initiate the horizontal ball object variables
      for(int i=0; i < 15; i++){
        //generate a random color using RGB
        Color color = new Color(randInt(0,255),
                                randInt(0,255),
                                randInt(0,255) );
        // create a ball
        Ball ball_x = new Ball(randInt(0,Game.width), //x
                             randInt(0,Game.height), //y
                             randInt(1,5), //dx
                             0, //dy
                             randInt(5,30), //diameter
                             color);
        //add the ball to the array
        ballList[i] = ball_x;
      }
	  // Initiate the vertical ball object variables
	  for(int i=15; i < 30; i++){
        //generate a random color using RGB
        Color color = new Color(randInt(0,255),
                                randInt(0,255),
                                randInt(0,255) );
        // create a ball
        Ball ball_y = new Ball(randInt(0,Game.width), //x
                             randInt(0,Game.height), //y
                             0, //dx
                             randInt(1,5), //dy
                             randInt(5,30), //diameter
                             color);
        //add the ball to the array
        ballList[i] = ball_y;
      }	  
    }
  
    public void gameLoop(){      
	  
	  //move each ball in the array
      for(int i=0; i < ballList.length; i++){        
		ballList[i].move();
		
		// increment count of collisions of any ball with mouse
		if( ballList[i].collidedWithMouse() ){
		  count++;
		}		
      }     
	  
	  // display # of collisions   
      text = "Collisions: " + count;
      Game.canvas.drawString(text, 20, 20);
	  
    }

  
    // random #
    int randInt(int lower, int upper){
      int range = upper - lower + 1;
      return (int)(Math.random()*range) + lower;
    }
}
