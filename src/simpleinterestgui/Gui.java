package simpleinterestgui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
    
    Gui(){
        JFrame frame = new JFrame("Simple Interest");
        JPanel panel = new JPanel();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        
        panel.setSize(500,500);
        panel.setBackground(Color.decode("#d3d3d3"));
        frame.add(panel);
        
        
        frame.setVisible(true);
    }
    
}
