/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight.Shapes;

import flyweight.Shape;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author AJuda
 */
public class Circle implements Shape{

    @Override
    public void draw(Graphics graphics, int x1, int x2
            , int y1, int y2, Color color) 
    {
        graphics.setColor(color);
        graphics.drawOval(x1, x2, y1, y2);
    }
    
}
