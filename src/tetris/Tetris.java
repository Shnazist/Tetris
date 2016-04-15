/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author ahmei8766
 */
public class Tetris extends JFrame {
   int screenSizeX = 800;
   int screenSizeY = 600;
    
    public static void sleep( int numMilliseconds ) {
        try {
            Thread.sleep( numMilliseconds );
        } 
        
        catch (Exception e) {
        }
    }
    
    public void paint(Graphics g) {
      Image img = createImage();
      g.drawImage(img, 0, 0,this);
    }   
    
    public void setUpScreen() {
        setBackground(Color.blue);
        setSize(screenSizeX, screenSizeY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
    }
    public Image createImage() {
        BufferedImage bufferedImage = new BufferedImage(screenSizeX, screenSizeY, BufferedImage.TYPE_INT_RGB);

        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        
        return bufferedImage;
    }
    
    public static void main(String[] args) {
        Tetris tetris = new Tetris();
        tetris.setUpScreen();
    }
}
