import java.awt.*;
import javax.swing.*;

public class GameLogic {    
  Bomb bomb;// create Bomb object
  BackGround bk;// create Background object
  
  public GameLogic() {
    // instantiates bomb & background objects
    bomb = new Bomb(180,20,0,1);
    bk = new BackGround();
  }
  
  public void gameLoop(){
    bk.drawBk();
    bomb.move();
  }

}
