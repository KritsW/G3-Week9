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
public class Exceptionsssss {
    public static void main(String[] args) {
      File file=new File("file.txt");
      try {
      FileReader fr = new FileReader(file); 
      } 
      catch (java.io.FileNotFoundException e) {
          System.out.println("ไม่พบไฟล์");
      }
      System.out.println("Will this print ?");
    }
}

