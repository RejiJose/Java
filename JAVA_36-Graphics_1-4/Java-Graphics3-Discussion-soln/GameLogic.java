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
      // 2. Call the function drawBall()
      //drawBall();
      // 4. Call the function move()       
      move();
    }
  
    // 1. Create a function to draw a ball
    void drawBall(){
      // Set color to yellow
      Game.canvas.setColor(Color.yellow);
      // Draw a filled circle (with parameters for x, y, w, h)
      Game.canvas.fillOval(this.x, this.y, this.diameter, this.diameter);
      // Give the circle a black border
      Color blk = new Color(0,0,0);
      Game.canvas.setColor(blk);
      Game.canvas.drawOval(this.x, this.y, this.diameter, this.diameter);
    }  
    // 3. Create a function that moves a ball downwards (after drawing it)
    void move(){
      // Move the ball down
      this.y += 3;
      // restart the ball at the top once it hits the bottom of canvas
      if (this.y > Game.height){
        this.y = 0;
      }
      // draw the ball: invoke drawBall() fn
      drawBall();
    }
  
}
