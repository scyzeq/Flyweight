package flyweight;


import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJuda
 */
public class Colors {

    
    public Color getRandomColor() 
    {
        
        return Color.getHSBColor((float) (Math.random()*255)
                , (float) (Math.random()*255), (float) (Math.random()*255));
    }
}
