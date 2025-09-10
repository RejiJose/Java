import java.awt.*;
import javax.swing.*;

public class GameLogic {
   
  
    public GameLogic() {

    
    }
    public void gameLoop(){

      /* Task: Draw a diamond(rhombus) and draw the word DIAMOND above it, like in the file PICTURE.PNG   */
      
      // Draw the title DIAMOND in black
      Game.canvas.setColor(Color.BLACK);
      Game.canvas.drawString("DIAMOND", 120, 90);
  
      // Draw a rhombus in blue: a) outline only, and b) filled in
      Game.canvas.setColor(Color.blue);
      int[] xCord = {150,200,150,100};
      int[] yCord = {100,150,200,150};
      Game.canvas.drawPolygon(xCord, yCord, xCord.length);
      //Game.canvas.fillPolygon(xCord, yCord, xCord.length);



      
    }
  
}
