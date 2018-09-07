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
    private static final Color colors[] = { Color.RED
            , Color.GREEN, Color.BLUE, Color.BLACK, Color.DARK_GRAY};
    
    public Color getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}
