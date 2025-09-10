import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //String used to display mouse x & y coordinates
    String text ="";

    // 2nd create a ball one the canvus
    Ball ball ;
  
    public GameLogic() {
      ball = new Ball(50,50,0,1,30,Color.green);
    }
    public void gameLoop(){
      //Display mouse coordinates
      text = "Mouse("+Mouse.x+", "+Mouse.y+")";
      Game.canvas.drawString(text, 20, 20);


      ball.move();
      // TASK:  Modify the code so that the ball stops moving when the mouse is over the ball (i.e, when the mouse collides with ball)
         
    }
  
  // random #
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }


}
