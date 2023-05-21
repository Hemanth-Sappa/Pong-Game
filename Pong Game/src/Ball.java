import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    int xVelocity;
    int yVelocity;
    int intialSpeed;
    Random random;


    Ball(int x,int y,int width,int height) {
        super(x,y,width,height);
        random = new Random();
        int RandomXDirection = random.nextInt(2);
        if(RandomXDirection==0) {
            RandomXDirection--;
        }else {

        }
        setXDirection(RandomXDirection);
        int RandomYDirection = random.nextInt(2);
        if(RandomYDirection==0) {
            RandomYDirection--;
        }
        setYDirection(RandomYDirection);
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void move() {
        x +=xVelocity;
        y +=yVelocity;
    }
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x,y,width,height);

        g.setColor(Color.WHITE);
        g.drawLine(1200/2,0,1200/2,600);

        g.setColor(Color.WHITE);
        g.drawRect(300,100,600,400);

        g.setColor(Color.WHITE);
        g.drawOval(500,200,200,200);
    }
}
