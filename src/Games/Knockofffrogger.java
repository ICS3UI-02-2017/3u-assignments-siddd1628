package Games;

import static Games.TrafficRush.WIDTH;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author siddd1628
 */
public class Knockofffrogger extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 900;
    static final int HEIGHT = 900;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    // ball variables
    Rectangle ball = new Rectangle(420,790,25,25);
    int ballAngle = 45;
    int ballSpeed = 5;
    //car variables
    Rectangle car1 = new Rectangle(50,250,25,100);
    Rectangle car2 = new Rectangle(725,250,25,100);
    Rectangle car3 = new Rectangle(725,250,25,100);
    Rectangle car4 = new Rectangle(725,250,25,100);
    Rectangle car5 = new Rectangle(725,250,25,100);
    Rectangle car6 = new Rectangle(725,250,25,100);
    Rectangle car7 = new Rectangle(725,250,25,100);
    
    //create colours
     Color green = new Color(10, 168, 12);
     Color almostmint = new Color (66, 244, 182);
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Knockofffrogger(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //create the grass
        g.setColor(green);
        g.fillRect (0,0,WIDTH, HEIGHT);
        //create the road for the cars
        g.setColor(Color.BLACK);
        // create the roads
        g.fillRect(0,530,900,230);
	g.fillRect(0,250,900,230);
        g.fillRect(0,50,900,150);
         
        //create the yellow lines on the roads
        g.setColor(Color.YELLOW);
        g.fillRect (0,625,50,25);
        g.fillRect (80,625,50,25);
        g.fillRect (160,625,50,25);
        g.fillRect (240,625,50,25);
        g.fillRect (320,625,50,25);
        g.fillRect (400,625,50,25);
        g.fillRect (480,625,50,25);
        g.fillRect (560,625,50,25);
        g.fillRect (640,625,50,25);
        g.fillRect (720,625,50,25);
        g.fillRect (800,625,50,25);
        g.fillRect (880,625,50,25);
        g.fillRect (0,350,50,25);
        g.fillRect (80,350,50,25);
        g.fillRect (160,350,50,25);
        g.fillRect (240,350,50,25);
        g.fillRect (320,350,50,25);
        g.fillRect (400,350,50,25);
        g.fillRect (480,350,50,25);
        g.fillRect (560,350,50,25);
        g.fillRect (640,350,50,25);
        g.fillRect (720,350,50,25);
        g.fillRect (800,350,50,25);
        g.fillRect (880,350,50,25);
        g.fillRect (0,120,50,25);
        g.fillRect (80,120,50,25);
        g.fillRect (160,120,50,25);
        g.fillRect (240,120,50,25);
        g.fillRect (320,120,50,25);
        g.fillRect (400,120,50,25);
        g.fillRect (480,120,50,25);
        g.fillRect (560,120,50,25);
        g.fillRect (640,120,50,25);
        g.fillRect (720,120,50,25);
        g.fillRect (800,120,50,25);
        g.fillRect (880,120,50,25);
        // draw the ball
        g.setColor(almostmint);
        g.fillRect(ball.x, ball.y, ball.width, ball.height);
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        movingCars();
        movingBall();
        checkforCollision();
        checkforPassing();
    }

    private void movingCars() {
         // convert ball angle to radians to use in trig
        double newAngle = Math.toRadians(ballAngle);
        // determine how much to move ball x and ball y
        // using trig
        double moveX = ballSpeed*Math.cos(newAngle);
        double moveY = ballSpeed*Math.sin(newAngle);
        // move the ball
        ball.x = ball.x + (int)moveX;
        ball.y = ball.y + (int)moveY;
        
         // convert ball angle to radians to use in trig
        double newAngle = Math.toRadians(ballAngle);
        // determine how much to move ball x and ball y
        // using trig
        double moveX = ballSpeed*Math.cos(newAngle);
        double moveY = ballSpeed*Math.sin(newAngle);
        // move the ball
        ball.x = ball.x + (int)moveX;
        ball.y = ball.y + (int)moveY;
        
    }

    private void movingBall() {
        
    }

    private void checkforCollision() {
        throw new UnsupportedOperationException(); 
    }

    private void checkforPassing() {
        
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        Knockofffrogger game = new Knockofffrogger();
    }
}

