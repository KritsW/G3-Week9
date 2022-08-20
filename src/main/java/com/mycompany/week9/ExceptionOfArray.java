/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author nogam
 */
import java.io.File;
import java.io.FileReader;
public class ExceptionOfArray  {
    public static void main(String[] args) {
        
        
     int num[]={1,2,3,4};
     try{
         System.out.println(num[5]);
     }
     catch (java.lang.ArrayIndexOutOfBoundsException e){
         System.out.println("ไม่สามารถใช้งานตำแหน่งที่ 5 ของอะเรย์ที่มีขนาด 4 ได้");
     }
      System.out.println("Will this print ?");
    }
}

