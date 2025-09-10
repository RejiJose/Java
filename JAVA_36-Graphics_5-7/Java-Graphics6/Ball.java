import java.awt.*;
import javax.swing.*;

class Ball{
  int x,y;
  int dx,dy;
  int diameter;
  Color color;
  boolean visible;//to show ball or not
  
  Ball(int x, int y,
       int dx, int dy,
       int diameter, Color color){    
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;    
    this.diameter = diameter;
    this.color = color;
    this.visible = true; // default true
  }
  
  void move(){
    // move ball down
    this.y += this.dy;

    if(this.y > Game.height){
      this.y = 0;
    }
    
    drawBall();    
  }
  
  void drawBall(){
    // circle       
    Game.canvas.setColor(this.color);
    Game.canvas.fillOval(this.x,
                         this.y,
                         this.diameter,
                         this.diameter);
    Game.canvas.setColor(Color.black);
    Game.canvas.drawOval(this.x,
                         this.y,
                         this.diameter,
                         this.diameter);      
  }

  // fn for mouse collision with ball
  boolean collidedWithMouse(){
    // dist b/w 2 pts: d = sq.root of [(x2 - x1)^2 + (y2-y1)^2]
    double dist = Math.sqrt( 
      Math.pow( this.x + this.diameter/2 - Mouse.x, 2 ) +
      Math.pow( this.y + this.diameter/2 - Mouse.y, 2 ) );
    
    return (dist < this.diameter/2);
  }

  
}