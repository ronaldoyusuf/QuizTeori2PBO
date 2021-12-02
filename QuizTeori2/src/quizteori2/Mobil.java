/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizteori2;
import java.awt.*;
/**
 *
 * @author Ronaldo Yusuf
 */
public class Mobil extends Panel {
Mobil(){
}
public void paint (Graphics g) {
g.setColor(Color.BLUE);
g.fillRect(0, 250, 350, 100);
g.fillRect(0, 200, 250, 60);
g.setColor(Color.RED);
g.fillArc(30,300,100,100,0,360);
g.fillArc(200,300,100,100,0,360);
g.setColor(Color.RED);
g.drawLine(0, 250, 250, 250);
g.drawLine(0, 200, 250, 200);
g.drawLine(250, 200, 250, 250);


      }
public static void main(String[] args) {
Frame f = new Frame ("Testing Graphics Panel");
 Mobil gp = new Mobil();
  f.add (gp);
   f.setSize (900, 900); 
   f. setVisible(true);
   }
   
}
