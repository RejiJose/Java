import java.awt.*;
import javax.swing.*;

public class GameLogic {
    // String used to display mouse x & y coordinates
    String text = "";

    // Create a ball
    Ball ball ;  
   
    public GameLogic() {
      // instantiate ball parameters (x,y, dx,dy, diam, color)
      ball = new Ball(50,50,0,1,75,Color.green);
    }
  
    public void gameLoop(){
      //Display mouse coordinates
      text = "Mouse("+Mouse.x+", "+Mouse.y+")";
      Game.canvas.drawString(text, 20, 20);

      if(ball.visible){
        ball.move();
      } 
      
      // make ball disappear when mouse collides with ball 
      if( ball.collidedWithMouse() ){
        Game.canvas.drawString("Collision!", 180, 50);
        ball.visible = false;
      }
      else{
        ball.visible = true;
      }     
      
    }


  // random #
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }


}
