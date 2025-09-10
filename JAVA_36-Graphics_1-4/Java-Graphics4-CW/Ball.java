import java.awt.*;
import javax.swing.*;

class Ball{
  // class variables
  int x,y;
  int dx,dy;// speed (positional change rate)
  int diameter;
  Color color;
  
  // constructor
  Ball(int x, int y,
       int dx, int dy, int diameter, 
       Color color){    
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;    
    this.diameter = diameter;
    this.color = color;
  }
  
  void move(){
    // Modify the move() fn to make the ball move vertically (top to bottom) and also horizontally (left to right).
      this.y += this.dy;// vertical
    
      if(this.y > Game.height){
          this.y = 0;
      }
      drawBall();
  }
  
  void drawBall(){
      // set color and fill circle; give border     
      Game.canvas.setColor(this.color);
      Game.canvas.fillOval(this.x, this.y,
                           this.diameter,
                           this.diameter);
      Color blk = new Color(0,0,0);
      Game.canvas.setColor(blk);
      Game.canvas.drawOval(this.x, this.y,
                          this.diameter,
                           this.diameter);
  }
}