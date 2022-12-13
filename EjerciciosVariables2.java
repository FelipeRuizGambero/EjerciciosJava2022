/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;

public class EjerciciosVariables2 {

    public static void main(String[] args) {
 
    Scanner lector = new Scanner (System.in);
    int x;
    int y;
           
    System.out.println("¿Cuanto vale x?");
  
    x = lector.nextInt();
    
    System.out.println("¿Cuanto vale y?");
  
    y = lector.nextInt();
    
    
    
     var z = x + y;
     var v = x % y;
     var w = x * y;
     var ñ = x / y;
     
    System.out.println("la suma x + y = " + z);
    System.out.println("la resta x - y = " + v);
    System.out.println("la multiplicación x * y = " + w);
    System.out.println("la división x / y = " + ñ);
        
        
        
        
    }
    
}
