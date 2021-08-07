package simpleinterestgui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {
    
    InputData input = new InputData();
    
    SolveProblem sp;
    
    Gui(){
        JFrame frame = new JFrame("Simple Interest");
        JPanel panel = new JPanel();
        
        JLabel Title = new JLabel("Simple Interest Calculator");
        
        JLabel PrincipalLabel = new JLabel("Principal");
        JLabel RateLabel = new JLabel("Rate");
        JLabel TimeLabel = new JLabel("Time");
        JLabel InterestLabel = new JLabel("Interest");
        
        JTextField Principal = new JTextField();
        JTextField Rate = new JTextField();
        JTextField Time = new JTextField();
        JTextField Interest = new JTextField();
        
        JButton Clear = new JButton("Clear");
        JButton Solve = new JButton("Solve");
        
//****** Frames ****************************************************************     
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        
        panel.setSize(500,500);
        panel.setLayout(null);
        panel.setBackground(Color.decode("#d3d3d3"));
        frame.add(panel);
        
//****** Labels ****************************************************************
        
        Title.setBounds(60, 40, 380, 35);
        Title.setBorder(null);
        Title.setFont(new Font("berlin sans fb", Font.PLAIN, 35));
        panel.add(Title);
        
        PrincipalLabel.setBounds(110, 120, 100, 30);
        PrincipalLabel.setBorder(null);
        PrincipalLabel.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(PrincipalLabel);
        
        RateLabel.setBounds(145, 180, 100, 30);
        RateLabel.setBorder(null);
        RateLabel.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(RateLabel);
        
        TimeLabel.setBounds(140, 240, 100, 30);
        TimeLabel.setBorder(null);
        TimeLabel.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(TimeLabel);
        
        InterestLabel.setBounds(120, 300, 100, 30);
        InterestLabel.setBorder(null);
        InterestLabel.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(InterestLabel);
        
//****** Textfields ************************************************************
       
        Principal.setBorder(null);
        Principal.setBounds(220, 120,200, 30);
        Principal.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(Principal);
        
        Rate.setBorder(null);
        Rate.setBounds(220, 180,200, 30);
        Rate.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        panel.add(Rate);
               
        Time.setBorder(null);
        Time.setBounds(220, 240,200, 30);
        Time.setFont(new Font("berlin sans fb", Font.PLAIN, 25));     
        panel.add(Time);
        
        Interest.setBorder(null);
        Interest.setBounds(220, 300,200, 30);
        Interest.setFont(new Font("berlin sans fb", Font.PLAIN, 25));     
        panel.add(Interest);
        
//****** Buttons ***************************************************************        
        
        Clear.setBounds(280, 360, 100, 40);
        Clear.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        Clear.setBackground(null);
        Clear.setFocusable(false);
        Clear.setCursor(new Cursor(12));
        Clear.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        panel.add(Clear);
        
        Solve.setBounds(100, 360, 100, 40);
        Solve.setFont(new Font("berlin sans fb", Font.PLAIN, 25));
        Solve.setBackground(null);
        Solve.setFocusable(false);
        Solve.setCursor(new Cursor(12));
        Solve.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        panel.add(Solve);

//****** Action Listener *******************************************************
        
        Clear.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent clear) {
                Principal.setText("");
                Rate.setText("");
                Time.setText("");
                Interest.setText("");
            }
        });
        
        Solve.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent solve){
                
                try {
                    if (Principal.getText().equals("")) {
                        
                        input.setInterest(Double.parseDouble(Interest.getText()));
                        input.setRate(Double.parseDouble(Rate.getText()));
                        
                        sp = new SolvePrincipal();
                        
                        Principal.setText(String.valueOf(input.getPrincipal()));

                    } else if(Rate.getText().equals("")){

                    } else if(Interest.getText().equals("")){

                    }
                } catch (Exception e) {
                }
                
            }
        });
        
        frame.setVisible(true);
    }
    
}
