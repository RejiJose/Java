import java.awt.*;
import javax.swing.*;

public class GameLogic {
    // create class variables  
    int x=20, y=20; // x and y positions
    int diameter=40; // diameter is both width and height
  
    //constructor  
    public GameLogic() {
  
    }
  
    public void gameLoop(){
      //call move() fn
      move();
    }
  
    //Create a function to draw a ball
    void drawBall(){
      Game.canvas.setColor(Color.yellow);
      Game.canvas.fillOval(this.x,this.y,
                           this.diameter,
                           this.diameter);
      //add a border 
      Color blk = new Color(0,0,0);
      Game.canvas.setColor(blk);
      Game.canvas.drawOval(this.x,this.y,
                           this.diameter,
                           this.diameter);      
    }  

    void move(){
      // Task: Move the ball from left to right and when it reaches the right border, create the illusion that a new ball is coming from the left by repositioning the ball to the left border.      
      this.x += 2;
      if(this.x > Game.width){
        this.x = 0;
      }
      drawBall();
    }
  
}
