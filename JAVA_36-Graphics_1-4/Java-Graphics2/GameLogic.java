import java.awt.*;
import javax.swing.*;

public class GameLogic {
   
    // constructor
    public GameLogic() {
    
    }
    public void gameLoop(){
      // Set pen color to red (Refer to the Color class)
      Game.canvas.setColor(Color.red);// variable red in class Color
	  Game.canvas.setColor( new Color(0,255,0) );
      Game.canvas.drawRect(80,20,150,60);

      // All future shapes are drawn with the last set color
      Game.canvas.drawRect(20,60,40,40);

      // Create a color object with a custom rgb color
      Color hue = new Color(255,0,255);// magenta
      Game.canvas.setColor(hue);
      
      // Draw a disk (filled-in circle/oval)      
      Game.canvas.fillOval(120,140,30,30);//circle
      Game.canvas.fillOval(200,140,30,40);//ellipse

      // Draw a n-sided polygon
      // Draw a right triangle
      int[] xCords = {50,50,100};// array of x-coords
      int[] yCords = {150,200,200};// array of y-coords
      Game.canvas.drawPolygon(xCords, yCords, xCords.length);

      //Draw an equalateral triangle
      int[] xCord2 = {100,75,125};
      int[] yCord2 = {220,270,270};
      Game.canvas.fillPolygon(xCord2, yCord2, xCord2.length);
      
      //Draw a string
      Game.canvas.drawString("Hello", 20, 120);
    }
  
}
