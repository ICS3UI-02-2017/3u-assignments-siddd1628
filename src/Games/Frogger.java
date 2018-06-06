package Games;

import static Games.Knockofffrogger.WIDTH;
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
public class Frogger extends JComponent implements ActionListener {

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
  
    //car variables
    Rectangle car1 = new Rectangle(770,55,100,50);
    int car1Angle = 180;
    int car1Speed = 2;
    Rectangle car2 = new Rectangle(620,55,100,50);
    int car2Angle = 180;
    int car2Speed = 2;
    Rectangle car3 = new Rectangle(470,55,100,50);
    int car3Angle = 180;
    int car3Speed = 2;
    Rectangle car4 = new Rectangle(320,55,100,50);
    int car4Angle= 180;
    int car4Speed = 2;
    Rectangle car5 = new Rectangle(170,55,100,50);
    int car5Angle= 180;
    int car5Speed = 2;
    Rectangle car6 = new Rectangle(20,55,100,50);
    int car6Angle= 180;
    int car6Speed = 2;
    
    Rectangle car7 = new Rectangle(725,260,150,70);
    int car7Angle= 180;
    int car7Speed = 5;
    
    Rectangle car8 = new Rectangle(520,260,150,70);
    int car8Angle= 180;
    int car8Speed = 5;
    
    Rectangle car9 = new Rectangle(315,260,150,70);
    int car9Angle= 180;
    int car9Speed = 5;
    
    Rectangle car10 = new Rectangle(110,260,150,70);
    int car10Angle= 180;
    int car10Speed = 5;
    
    Rectangle car11 = new Rectangle(50,400,150,70);
    int car11Angle= 0;
    int car11Speed = 5;
    
    Rectangle car12 = new Rectangle(255,400,150,70);
    int car12Angle= 0;
    int car12Speed = 5;
    
    Rectangle car13 = new Rectangle(460,400,150,70);
    int car13Angle= 0;
    int car13Speed = 5;
    
    Rectangle car14 = new Rectangle(665,400,150,70);
    int car14Angle= 0;
    int car14Speed = 5;
    
    Rectangle car15 = new Rectangle(665,540,150,70);
    int car15Angle= 0;
    int car15Speed = 5;
    
    Rectangle car16 = new Rectangle(450,540,150,70);
    int car16Angle= 0;
    int car16Speed = 5;
    
    Rectangle car17 = new Rectangle(235,540,150,70);
    int car17Angle= 0;
    int car17Speed = 5;
    
    Rectangle car18 = new Rectangle(20,540,150,70);
    int car18Angle= 0;
    int car18Speed = 5;
    
    Rectangle car19 = new Rectangle(665,400,150,70);
    int car19Angle= 0;
    int car19Speed = 5;
    
    
    //create colours
     Color green = new Color(10, 168, 12);
     Color almostmint = new Color (66, 244, 182);
     Color yuckygreen = new Color (107, 244, 66);
     Color anicered = new Color (124, 11, 32);
     Color pastelyellow = new Color (223, 244, 66);
     Color violay = new Color (104, 66, 244);
     Color hotpink = new Color (255, 0, 229);
     Color purplealmostblue = new Color (29, 28, 71);
     Color forestgreen = new Color (15, 58, 30);
     Color dirtymustard = new Color (124, 153, 38);
     Color terracotta = new Color (237, 118, 54);
     Color kindofgrey = new Color (145, 126, 116);
   
    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public Frogger(){
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
        //draw the cars
        g.setColor(yuckygreen);
	g.fillRect(car1.x, car1.y, car1.width, car1.height);
        g.setColor(anicered);
	g.fillRect(car2.x, car2.y, car2.width, car2.height);
        g.setColor(violay);
	g.fillRect(car3.x, car3.y, car3.width, car3.height);
        g.setColor(pastelyellow);
        g.fillRect(car4.x, car4.y, car4.width, car4.height);
        g.setColor(hotpink);
        g.fillRect(car5.x, car5.y, car5.width, car5.height);
        g.setColor(purplealmostblue);
        g.fillRect(car6.x, car6.y, car6.width, car6.height);
        g.setColor(forestgreen);
        g.fillRect(car7.x, car7.y, car7.width, car7.height);
        g.setColor(dirtymustard);
        g.fillRect(car8.x, car8.y, car8.width, car8.height);
        g.setColor(terracotta);
        g.fillRect(car9.x, car9.y, car9.width, car9.height);
        g.setColor(kindofgrey);
        g.fillRect(car10.x, car10.y, car10.width, car10.height);
        g.fillRect(car11.x, car11.y, car11.width, car11.height);
        g.fillRect(car12.x, car12.y, car12.width, car12.height);
        g.fillRect(car13.x, car13.y, car13.width, car13.height);
        g.fillRect(car14.x, car14.y, car14.width, car14.height);
        g.fillRect(car15.x, car15.y, car15.width, car15.height);
        g.fillRect(car16.x, car16.y, car16.width, car16.height);
        g.fillRect(car17.x, car17.y, car17.width, car17.height);
        g.fillRect(car18.x, car18.y, car18.width, car18.height);
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
       
        // convert car angle to radians to use in trig
        double newAngle = Math.toRadians(car1Angle);
        // determine how much to move car x and car y
        // using trig
        double moveX = car1Speed*Math.cos(newAngle);
        double moveY = car1Speed*Math.sin(newAngle);
        
        
        
        //Cars 1-6 will be moving the same speed
        //CAR 1
        // move the car
        car1.x = car1.x + (int)moveX;
        car1.y = car1.y + (int)moveY;
       
        //CAR 2
        // make the care move
        car2.x = car2.x + (int)moveX;
        car2.y = car2.y + (int)moveY;
        
        //CAR 3
        car3.x = car3.x + (int)moveX;
        car3.y = car3.y + (int)moveY;
        
        //CAR 4
        car4.x = car4.x + (int)moveX;
        car4.y = car4.y + (int)moveY;
        
        //CAR 5
        car5.x = car5.x + (int)moveX;
        car5.y = car5.y + (int)moveY;
        
        //CAR 6
        car6.x = car6.x + (int)moveX;
        car6.y = car6.y + (int)moveY;
        
        //Cars 7- 10 will be the same speed
        // convert car angle to radians 
        double newAngle7to10 = Math.toRadians(car7Angle);
        double moveX7to10 = car7Speed*Math.cos(newAngle);
        double moveY7to10 = car7Speed*Math.sin(newAngle);
        
        //CAR 7
        car7.x = car7.x + (int)moveX7to10;
        car7.y = car7.y + (int)moveY7to10;
        
        
        //CAR 8
        car8.x = car8.x + (int)moveX7to10;
        car8.y = car8.y + (int)moveY7to10;
        
        //CAR 9
        car9.x = car9.x + (int)moveX7to10;
        car9.y = car9.y + (int)moveY7to10;
        
        //CAR 10
        car10.x = car10.x + (int)moveX7to10;
        car10.y = car10.y + (int)moveY7to10;
      
        //Cars 11-14 will  be the same speef
         // convert car angle to radians 
        double newAngle1114 = Math.toRadians(car11Angle);
        double moveX1114 = car11Speed*Math.cos(newAngle1114);
        double moveY1114 = car11Speed*Math.sin(newAngle1114);
        
         //CAR 11
        car11.x = car11.x + (int)moveX1114;
        car11.y = car11.y + (int)moveY1114;
        
         //CAR 12
        car12.x = car12.x + (int)moveX1114;
        car12.y = car12.y + (int)moveY1114;
        
        //CAR 13
        car13.x = car13.x + (int)moveX1114;
        car13.y = car13.y + (int)moveY1114;
        
        //CAR 14
        car14.x = car14.x + (int)moveX1114;
        car14.y = car14.y + (int)moveY1114;
        
     
        
        //whent he cars leave the screen
        
        }
    

    private void movingBall() {
        
    }

    private void checkforCollision() {
        
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
        Frogger game = new Frogger();
    }
}
