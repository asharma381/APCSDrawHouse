import gpdraw.*;
import java.awt.Color;

public class Warmup2 {
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    public Warmup2(){
        myPaper = new SketchPad(900,900);
        myPencil = new DrawingTool(myPaper);
       
        
    }
    
    public void draw(){
        myPencil.up();
       myPencil.turnLeft(90);
       myPencil.forward(150);
       myPencil.turnRight(90);
       myPencil.down();
       myPencil.setWidth(5);
       myPencil.drawRect(150,150);
       myPencil.up();
       myPencil.turn(180);
       myPencil.forward(150);
       myPencil.turnLeft(90);
       myPencil.forward(150);
       myPencil.down();
       myPencil.setColor(Color.red);
       myPencil.fillCircle(75);
    }
   
}
    