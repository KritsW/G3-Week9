/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author nogam
 */
public class ResizableCircle    extends Circle  implements Resizable {
    
    public ResizableCircle (double radius ) {
        
        super(radius);
    }

    @Override
    public void resize(int percentage) {
      
        if (percentage >= 0 && percentage <= 100)
       super.radius = percentage*0.01*super.radius;
    }
    
}
