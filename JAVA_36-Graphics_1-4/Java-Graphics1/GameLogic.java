import java.awt.*;
import javax.swing.*;

public class GameLogic {
   
    // constructor
    public GameLogic() {

    
    }
    // gameLoop fn (constantly loops)
    //int x=0; // used to demo looping
  
    public void gameLoop(){
      // MOST OF THE CODING DONE HERE
      
      //System.out.println(x); // used to demo looping
      //x++; // used to demo looping
      
      Game.canvas.drawRect(50,70,100,80);
      Game.canvas.drawRect(150,170,40,20);
      
    }
  
}
