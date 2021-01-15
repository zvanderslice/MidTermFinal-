
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Color;
import java.text.*;
import java.lang.Object;
import javax.swing.JFrame;
import java.awt.FontMetrics;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();
        
        //COLORS
       /*Valid colors are "red", "yellow", "blue", "green","magenta",
       "cyan", "brown", "white", and "black", or rgb hex strings*/
       
      
       
        // Set the title and background for the picture
        pic.setTitle("Colorful Train Scene, by Zachary Vanderslice");
        pic.setBackgroundColor("white");
        
        //Title and Name
        JFrame mainFrame = new JFrame("Title Image");
        mainFrame.getContentPane().add(new TitleName());
        mainFrame.pack();
        mainFrame.setVisible(true);
        
        //train shapes
        
        
                //snow plow
        Triangle tb = new Triangle();
        tb.makeVisible();
        tb.moveHorizontal(12);
        tb.moveVertical(180);
        /*positive x points up,negative x points down;
        Height first, then width*/
        tb.changeSize(150, 200);
        tb.changeColor("brown");
        
        //light
        Rect ri = new Rect();
        ri.makeVisible();
        ri.moveHorizontal(-115);
        ri.moveVertical(175);
        //rf.changeSize(100);
        // Height first, then width 
        ri.changeSize(23, 23); 
        ri.changeColor("yellow");
        
        // Draw Rectangle
        //cabin 
        Rect ra = new Rect();
        ra.makeVisible();
        ra.moveHorizontal(150);
        ra.moveVertical(75);
        ra.changeSize(100);
        // Height first, then width 
        ra.changeSize(210, 200); 
        ra.changeColor("red");
        
        //front 
        Rect rb = new Rect();
        rb.makeVisible();
        rb.moveHorizontal(-100);
        rb.moveVertical(155);
        rb.changeSize(100);
        // Height first, then width 
        rb.changeSize(125, 250); 
        rb.changeColor("green");
        
        //frame 
        Rect rc = new Rect();
        rc.makeVisible();
        rc.moveHorizontal(-100);
        rc.moveVertical(275);
        rc.changeSize(100);
        // Height first, then width 
        rc.changeSize(60, 450); 
        rc.changeColor("blue");
        
        //window 
        Rect rd = new Rect();
        rd.makeVisible();
        rd.moveHorizontal(200);
        rd.moveVertical(125);
        rd.changeSize(100);
        // Height first, then width 
        rd.changeSize(65, 100); 
        rd.changeColor("cyan");
        
        //smoke stack
        Rect re = new Rect();
        re.makeVisible();
        re.moveHorizontal(-82);
        re.moveVertical(74);
        re.changeSize(100);
        // Height first, then width 
        re.changeSize(90, 50); 
        re.changeColor("cyan");
        
        //bell
        Rect rf = new Rect();
        rf.makeVisible();
        rf.moveHorizontal(50);
        rf.moveVertical(115);
        //rf.changeSize(100);
        // Height first, then width 
        rf.changeSize(23, 23); 
        rf.changeColor("yellow");
        
        //bellpost
        Rect rg = new Rect();
        rg.makeVisible();
        rg.moveHorizontal(55);
        rg.moveVertical(105);
        //rf.changeSize(100);
        // Height first, then width 
        rg.changeSize(60, 10); 
        rg.changeColor("black");
        
        
        
        // Draw Circles 
        //left to right
        //wheel 1
        Circle ca = new Circle();
        ca.makeVisible();
        ca.moveHorizontal(3);
        ca.moveVertical(355);
        ca.changeSize(70);
        ca.changeColor("black");
        
        //wheel 2
        Circle cb = new Circle();
        cb.makeVisible();
        cb.moveHorizontal(95);
        cb.moveVertical(355);
        cb.changeSize(70);
        cb.changeColor("black");
        
        //wheel 3
        Circle cc = new Circle();
        cc.makeVisible();
        cc.moveHorizontal(190);
        cc.moveVertical(322);
        cc.changeSize(105);
        cc.changeColor("black");
        
        //wheel 4
        Circle cd = new Circle();
        cd.makeVisible();
        cd.moveHorizontal(310);
        cd.moveVertical(322);
        cd.changeSize(105);
        cd.changeColor("black");
        
        //rectangle had to go here for layering raesons
        //wheel bar
        Rect rh = new Rect();
        rh.makeVisible();
        rh.moveHorizontal(-50);
        rh.moveVertical(335);
        //rf.changeSize(100);
        // Height first, then width 
        rh.changeSize(15, 350); 
        rh.changeColor("red");
        
        
        // Draw Triangles
        //cabin roof
        Triangle ta = new Triangle();
        ta.makeVisible();
        ta.moveHorizontal(350);
        ta.moveVertical(-25);
        /*positive x points up,negative x points down;
        Height first, then width*/
        ta.changeSize(80, 250);
        ta.changeColor("black");
        

        
        //Draw Arcs
        //smoke hood
        Arc aa = new Arc();
        aa.makeVisible();
        aa.moveHorizontal(65);
        aa.moveVertical(30);
        //aa.setPosition(25,25);
        //aa.openArc();
        //aa.closeArc();
        aa.changeArcBeginning(230);
        aa.changeArcEnd(315);
        aa.changeSize(110);
        aa.changeColor("black");
        
        
     
        
        

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}