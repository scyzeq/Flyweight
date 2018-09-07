/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.Shapes.Circle;
import flyweight.Shapes.Line;
import flyweight.Shapes.Quadrangle;
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
        panel.setLayout(new BorderLayout());
        JPanel subPanel = new JPanel();
        
        JButton startButton = new JButton("Draw line");
        JButton startButton2 = new JButton("Draw circle");
        JButton startButton3 = new JButton("Draw quadrangle");
        JButton startButton4 = new JButton("Draw filled circle");
        
        subPanel.add(startButton);
        subPanel.add(startButton2);
        subPanel.add(startButton3);
        subPanel.add(startButton4);
        Container contentPane = getContentPane();
        
        Shape line = new Line();
        Circle circle = new Circle();
        Quadrangle quadrangle = new Quadrangle();
        Colors colors = new Colors();
        
        this.setTitle("Drawing");
        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(subPanel, BorderLayout.SOUTH);
        
        this.setSize(700,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Graphics g = panel.getGraphics();
        startButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {           
                line.draw(g, (int)(Math.random()*700), (int)(Math.random()*700)
                        , (int)(Math.random()*700), (int)(Math.random()*700)
                        , colors.getRandomColor());                
            }
        });        
        startButton2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                circle.setFill(false);
                circle.draw(g, (int)(Math.random()*500), (int)(Math.random()*500)
                        , (int)(Math.random()*500), (int)(Math.random()*500)
                        , colors.getRandomColor());  
            }
        });
        startButton3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                quadrangle.draw(g, (int)(Math.random()*500), (int)(Math.random()*500)
                        , (int)(Math.random()*500), (int)(Math.random()*500)
                        , colors.getRandomColor());  
            }
        });        
        startButton4.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                circle.setFill(true);
                circle.draw(g, (int)(Math.random()*500), (int)(Math.random()*500)
                        , (int)(Math.random()*500), (int)(Math.random()*500)
                        , colors.getRandomColor());  
            }
        });
    }
    
    
    public static void main(String[] args) 
    {
        new Flyweight();
    }
    
}
