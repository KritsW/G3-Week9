/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author nogam
 */

public class TestCircle {
    
    public static void main(String[] args) {
        
        Circle a = new Circle (3);
        System.out.println("Circle a area =  " + a.getArea() );
        System.out.println("Circle a Around the Circle =  " + a.getPerimeter());
        
        ResizableCircle b = new ResizableCircle (3);
        b.resize(70);
        System.out.println("Circle b Area = " + b.getArea());
        System.out.println("Circle b Around the Circle"+ b.getPerimeter());
         
        
    }
    
}
