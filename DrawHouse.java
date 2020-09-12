

import gpdraw.*;
import java.awt.Color;

public class DrawHouse {
    private DrawingTool myPencil;
    private SketchPad myPaper;
    private int hWidth;
    private int hHeight;
    private double tLength;
    private int rad;
    
    public DrawHouse(){
        myPaper = new SketchPad(900,900);
        myPencil = new DrawingTool(myPaper);
        hWidth = 350;
        hHeight = 300;
        tLength = 247.5;
        rad = 20;
        
    }
    
    public void draw(){
        drawSky();
        changeLocation();
        drawFrame();
        drawRoof();
        drawBack();
        drawRoofDesign();
        drawSun();
        drawTrees();
    }
    
    public void drawSky(){
        //This draws the blue background on the sky
        myPencil.up();
        myPencil.forward(250);
        myPencil.down();
        Color c = new Color(7,154,245,180);
        myPencil.setColor(c);
        myPencil.fillRect(900,700);
        myPencil.up();
        myPencil.backward(250);
        
        myPencil.backward(300);
        myPencil.down();
        myPencil.setColor(Color.green);
        myPencil.fillRect(900,410);
        myPencil.up();
        myPencil.forward(300);
        myPencil.setColor(Color.black);
        myPencil.down();
    }
    
    public void changeLocation(){
        //This moves the pen from the center to the left side of the house
        myPencil.up();
        myPencil.backward(200);
        myPencil.turn(90);
        myPencil.forward(100);
        myPencil.turn(270);
        myPencil.down();
    }
    
    public void drawFrame(){
        //This creates a door & the main first frame
        
        
        myPencil.up();
        myPencil.forward(70);
        myPencil.down();
        Color c = new Color(139,69,19,250);
        myPencil.setColor(c);
        myPencil.fillRect(hWidth,hHeight);
        myPencil.setColor(Color.black);
        myPencil.up();
        myPencil.backward(75);
        myPencil.down();
         Color color = new Color(54,20,20,255);
        myPencil.setColor(color);
        myPencil.fillRect(100,150);
   
        myPencil.up();
        myPencil.forward(75);
        myPencil.down();
    }
    
    public void drawRoof(){
        //This creates the triangular roof 
        Color c = new Color(139,69,19,250); 
        myPencil.setColor(c);
        myPencil.up();
        myPencil.forward(150);
        myPencil.turn(90);
        myPencil.forward(175);
        myPencil.turn(225);
        
        
        myPencil.down();
        myPencil.setWidth(4);
        Color color = new Color(54,20,20,255);
        myPencil.setColor(color);
        myPencil.forward(tLength);
        myPencil.setColor(c);
        

        
        myPencil.turn(270);
        myPencil.forward(tLength);
    }
    
    public void drawBack(){
        //This creates the 3-D looking house
          myPencil.turn(90);
  
        myPencil.forward(250);
        myPencil.turn(225);
        myPencil.forward(300);
        myPencil.turn(315);
        myPencil.forward(250);
        myPencil.turn(225);
        
        // the values should be 300, but I put 350 to test 
        myPencil.forward(300);
        myPencil.turn(315);
        myPencil.forward(250);
        myPencil.turn(90);
        
        Color c = new Color(139,69,19,190);
        myPencil.setColor(c);
        myPencil.setWidth(10);
        
        myPencil.forward(tLength);
        
        createDesign();
        
       
    }
    
    public void createDesign(){
        //Arrange the roof 
        
        myPencil.turn(90);
        
        for(int i = 0; i < 7; i++){
            myPencil.forward(tLength);
            myPencil.turn(90);
            myPencil.forward(18);
            myPencil.turn(90);
            myPencil.forward(tLength);
            myPencil.turnRight(90);
            myPencil.forward(18);
            myPencil.turnRight(90);
        }
          
        for(int j = 0; j < 7; j++){   
              myPencil.forward(18);
              myPencil.turnRight(90);
              myPencil.forward(tLength);
              myPencil.turn(90);
              myPencil.forward(18);
              myPencil.turn(90);
              myPencil.forward(tLength);
              myPencil.turnRight(90);
        }
        
        myPencil.turn(45);
        //myPencil.setWidth();
        Color color = new Color(139,69,19,255);
        myPencil.setColor(color);
        for(int k = 0; k < 14; k++){
            myPencil.forward(hHeight - 10);
            myPencil.turn(135);
            myPencil.forward(9);
            myPencil.turn(45);
            myPencil.forward(hHeight - 10);
            myPencil.turnRight(45);
            myPencil.forward(9);
            myPencil.turnRight(135);
            //myPencil.forward(hHeight - 10);
        }
        myPencil.forward(hHeight - 10);
        myPencil.turnRight(45);
        myPencil.forward(hHeight - 50);
        
        
        //myPencil.forward(100);
    }
    
    public void drawRoofDesign(){
        myPencil.turnRight(135);
        myPencil.setWidth(2);
        //myPencil.setColor(Color.black);
        
        Color color = new Color(54,20,20,255);
        myPencil.setColor(color);
        
        myPencil.forward(hHeight - 10);
        myPencil.up();
        myPencil.turn(90);
        myPencil.forward(30);
        myPencil.turnRight(90);
        myPencil.forward(10);
        myPencil.down();
        
        
        createCirclePattern(11);
        myPencil.up();
        myPencil.forward(rad);
        myPencil.turnRight(90);
        myPencil.forward(15 *rad);
        myPencil.turn(90);
        myPencil.forward(rad - 10);
        myPencil.down();
        
        createCirclePattern(9);
        myPencil.up();
        myPencil.forward(rad);
        myPencil.turnRight(90);
        myPencil.forward(12 *rad);
        myPencil.turn(90);
        myPencil.forward(rad - 10);
        myPencil.down();
        
        createCirclePattern(7);
        myPencil.up();
        myPencil.forward(rad);
        myPencil.turnRight(90);
        myPencil.forward(9 *rad);
        myPencil.turn(90);
        myPencil.forward(rad - 10);
        myPencil.down();
        
        createCirclePattern(5);
        myPencil.up();
        myPencil.forward(rad);
        myPencil.turnRight(90);
        myPencil.forward(6 *rad);
        myPencil.turn(90);
        myPencil.forward(rad - 10);
        myPencil.down();
        
        createCirclePattern(3);
        myPencil.up();
        myPencil.forward(rad);
        myPencil.turnRight(90);
        myPencil.forward(3 *rad);
        myPencil.turn(90);
        myPencil.forward(rad - 10);
        myPencil.down();
        
        createCirclePattern(1);
        
    }
    
    public void createCirclePattern(int numCircles){

        
        for(int i = 0; i< numCircles; i++){
            myPencil.fillCircle(rad);
            myPencil.up();
            myPencil.turn(90);
            myPencil.move((2*rad) - 10);
            myPencil.turnRight(90);
            myPencil.down();
        }
        //myPencil.forward(100);
        
    }
   
    public void drawSun(){
        myPencil.up();
        myPencil.forward(200);
        myPencil.turn(90);
        myPencil.forward(250);
        myPencil.down();
        myPencil.setColor(Color.yellow);
        myPencil.fillCircle(125);
    }

    public void drawTrees(){
        myPencil.up();
        myPencil.turn(90);
        myPencil.forward(600);
        myPencil.down();
        myPencil.turn(180);
        
        drawShrub();
        
        myPencil.up();
        myPencil.turnRight(90);
        myPencil.forward(700);
        myPencil.turnRight(90);
        myPencil.forward(150);
        myPencil.turn(180);
        myPencil.down();
        drawShrub();
        
        
        myPencil.up();
        myPencil.turnRight(90);
        myPencil.forward(75);
        myPencil.turn(90);
        myPencil.down();
        drawShrub();
    }
    
    public void drawShrub(){
        Color color = new Color(54,20,20,255);
        myPencil.setColor(color);
        myPencil.forward(125);
        Color c = new Color(30,80,20);
        myPencil.setColor(c);
        myPencil.fillOval(80,175);
    }
}
    