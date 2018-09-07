/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.Shapes.Circle;
import flyweight.Shapes.Line;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author AJuda
 */
public class Flyweight extends JFrame{

    public Flyweight()
    {
        final JPanel panel = new JPanel();
        JButton startButton = new JButton("Draw line");
        JButton startButton2 = new JButton("Draw circle");
        Container contentPane = getContentPane();
        Shape line = new Line();
        Shape circle = new Circle();
        this.setTitle("Drawing");
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        contentPane.add(startButton2, BorderLayout.WEST);
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Graphics g = panel.getGraphics();
//                line.draw(g, 150, 150, 200, 200, Color.red);                
                line.draw(g, (int)(Math.random()*500), (int)(Math.random()*500)
                        , (int)(Math.random()*500), (int)(Math.random()*500)
                        , Color.red);                
            }
        });        
        startButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Graphics g = panel.getGraphics();
//                circle.draw(g, 0, 0, 150, 150, Color.blue);  
                circle.draw(g, (int)(Math.random()*500), (int)(Math.random()*500)
                        , (int)(Math.random()*500), (int)(Math.random()*500)
                        , Color.blue);  
            }
        });
        
    }
    
//    public void paint(Graphics g)
//    {
//        g.setColor(Color.red);
//        g.drawLine(150, 150, 200, 200);
//    }
    
    public static void main(String[] args) 
    {
        new Flyweight();
    }
    
}
