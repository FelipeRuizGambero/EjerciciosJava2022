/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;

public class Ejercicios_if_else {


    public static void main(String[] args) {
    
    Scanner lector = new Scanner (System.in);
       int time;
           
       System.out.println("¿Que hora es?");
  
       time = lector.nextInt();
        
        if (time < 12 || time > 5) {
                 System.out.println("Buenos días.");
            }
 
            else if (time > 12 || time < 20) {
                 System.out.println("Buenas tardes.");
             }
            
             else {
                 System.out.println("Buenas noches.");
             }
    }
    
}
