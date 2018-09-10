/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.Shapes.Circle;
import flyweight.Shapes.Line;
import flyweight.Shapes.Quadrangle;
import java.util.HashMap;

/**
 *
 * @author AJuda
 */
public class RandomShape {
    

    public static Shape getShape(ShapeType shapeType)
    {
        Shape shapeChoice = null;
        
        if (shapeChoice == null) 
        {
            if (shapeType.equals(ShapeType.circle_fill)) 
            {
                shapeChoice = new Circle(true);
            } 
            else if (shapeType.equals(ShapeType.circle_no_fill)) 
            {
                shapeChoice = new Circle(false);
            } 
            else if (shapeType.equals(ShapeType.square_fill)) 
            {
                shapeChoice = new Quadrangle(true);
            } 
            else if (shapeType.equals(ShapeType.square_no_fill)) 
            {
                shapeChoice = new Quadrangle(false);
            } 
            else if (shapeType.equals(ShapeType.line)) 
            {
                shapeChoice = new Line();
            }
        }
        return shapeChoice;
    }
    
    public ShapeType getRandomShape()
    {
        ShapeType shapesList[] = { ShapeType.circle_fill,
            ShapeType.circle_no_fill, ShapeType.line, ShapeType.square_fill,
            ShapeType.square_no_fill};
        return shapesList[(int) (Math.random() * shapesList.length)];
    }
}
