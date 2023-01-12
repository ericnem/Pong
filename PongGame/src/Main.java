// Eric Nemrodov, Julia Opeshansky
// Mr. Naccarato
// ICS 4U2
// Pong Assignment, Module 4

import javax.swing.*;
import java.awt.Color;
class Main
{
  public static void main(String[] args)
  {

    Draw draw = new Draw();
    
    JFrame frame = new JFrame("Graphics");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(700, 500);
    frame.setBackground(Color.BLACK); // Makes background black

    frame.setResizable(false);

    // Fills frame with game objects
    frame.add(draw);
    frame.setBackground(Color.BLACK); 
    frame.setVisible(true);
    draw.menuFnc(0);
    
  }
  
}