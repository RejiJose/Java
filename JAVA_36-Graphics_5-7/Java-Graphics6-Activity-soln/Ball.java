import java.awt.*;
import javax.swing.*;

class Ball{
  // class variables
  int x,y;
  int dx,dy;
  int diameter;
  Color color;

  // constructor
  Ball(int x, int y,
       int dx, int dy, 
       int diameter, Color color){    
    this.x = x;
    this.y = y;
    this.dx = dx;
    this.dy = dy;    
    this.diameter = diameter;
    this.color = color;
  }

  void move(){
    //Move ball
    this.x += this.dx;
	this.y += this.dy;
      
	if(this.x > Game.width){
      this.x = 0;
    }
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
    // dist b/w 2 pts = sq.root of [(Δx)^2 + (Δy)^2]
    double dist = Math.sqrt( 
      Math.pow( this.x + this.diameter/2 - Mouse.x, 2 ) +
      Math.pow( this.y + this.diameter/2 - Mouse.y, 2 ) );

    return (dist < this.diameter/2);
  }

}