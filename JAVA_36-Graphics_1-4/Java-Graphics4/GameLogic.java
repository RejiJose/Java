import java.awt.*;
import javax.swing.*;

public class GameLogic {
  // class variables  
  Ball ball;  
  
  //constructor
  public GameLogic() {
    // create(instantiate) new ball object
    ball = new Ball(60,10,0,1,40,Color.cyan);
  
  }
  
  public void gameLoop(){
    // make ball object move
    ball.move();
    
  }

  


  // random #
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}
