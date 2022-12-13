/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;


public class EjerciciosBucles {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
       
      int num;
      
        
        System.out.println("Escribe numero entero");
        num = lector.nextInt();
       
        for (int i = 0; i < 10; i++){
            
           System.out.println(num * i);
        }
        
        
        
    }
    
}
