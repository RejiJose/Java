import javax.swing.*;

/**
 * Created by rcastro on 1/31/2018.
 */
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        // Game canvas
        Game c = new Game(300,400);
        f.add(c);
        f.setSize(Game.width, Game.height);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
