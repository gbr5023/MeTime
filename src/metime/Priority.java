/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metime;

import java.awt.Color;

/**
 *
 * @author justi
 */
public enum Priority {
    NEUTRAL(Color.WHITE), HIGH(Color.RED), MEDIUM(Color.ORANGE), LOW(Color.YELLOW);
    
    
    private final Color color;
    Priority(Color color){
        this.color = color; 
    }
    
    public Color getColor() { 
        return color; 
    }
}
