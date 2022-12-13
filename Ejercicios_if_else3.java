/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;


public class Ejercicios_if_else3 {

    
    public static void main(String[] args) {
       
        
        Scanner lector = new Scanner (System.in);
    
         int nota1;
         int nota2;
         int nota3;
        
       System.out.println("Dame una nota");
       nota1 = lector.nextInt();
       
       System.out.println("Dame una nota");
       nota2 = lector.nextInt();
       
       System.out.println("Dame una nota");
       nota3 = lector.nextInt();
       
       var z = (nota1 + nota2 + nota3) / 3;
       
       if (z < 5){
           System.out.println("tu nota es " + z + " por tanto es insuficiente");
       }
       if (z >= 5 || z <= 6 ){
           System.out.println("tu nota es " + z + " por tanto es suficiente");
       }
       if (z >= 6 || z <=7 ){
           System.out.println("tu nota es " + z + " por tanto es notable");
       }
       if (z >= 8.5 ) {
           System.out.println("tu nota es " + z + " por tanto es sobresaliente");
       }

    }
    
}
