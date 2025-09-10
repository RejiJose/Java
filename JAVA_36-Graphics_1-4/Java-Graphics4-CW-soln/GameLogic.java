import java.awt.*;
import javax.swing.*;

public class GameLogic {
    //class variables
    Ball ball1, ball2;
    
    //constructor
    public GameLogic() {
      // create(instantiate) 2 balls - one that moves vertically(dx=0) and a 2nd that moves horizontally(dy=0)
      ball1 = new Ball(30,10,0,2,40,Color.yellow);
      ball2 = new Ball(0,10,1,0,40,Color.red);    
    }
  
    public void gameLoop(){
      // make ball objects move
      ball1.move();
      ball2.move();      
    }

  
    // random #
    int randInt(int lower, int upper){
      int range = upper - lower + 1;
      return (int)(Math.random()*range) + lower;
    }
}
