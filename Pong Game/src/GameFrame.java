import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {


    GameFrame() {
        setTitle("Pong Game");
        getContentPane().setBackground(Color.BLACK);
        GamePanel panel = new GamePanel();
        add(panel);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        GameFrame g = new GameFrame();
    }
}
