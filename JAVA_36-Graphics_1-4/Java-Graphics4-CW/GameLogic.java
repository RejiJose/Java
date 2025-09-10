import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //class variables
    Ball ball;

    //constructor
    public GameLogic() {
      // create(instantiate) 2 balls - one that moves vertically(dx=0) and a 2nd that moves horizontally(dy=0)
      ball = new Ball(60,10,0,1,40,Color.yellow);     
    }
  
    public void gameLoop(){
      // make ball objects move
      ball.move();
      
    }

  


    // random #
    int randInt(int lower, int upper){
      int range = upper - lower + 1;
      return (int)(Math.random()*range) + lower;
    }

}
