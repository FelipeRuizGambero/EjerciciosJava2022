/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;


public class Ejercicios_if_else4 {

    public static void main(String[] args) {
  
       // Escribe un programa que ordene tres números enteros introducidos por teclado
       Scanner lector = new Scanner (System.in);
       
       int num1;
       int num2;
       int num3;
   
      
       
        System.out.println("Dame un número primo");
        num1 = lector.nextInt();
        
        System.out.println("Dame un número primo");
        num2 = lector.nextInt();
        
        System.out.println("Dame un número primo");
        num3 = lector.nextInt();
        
        
        if (num1 < num2 && num2 < num3){
           System.out.println(num1 + "<" + num2 + "<" + num3);
        }
        if (num2 < num1 && num1 < num3){
           System.out.println(num2 + "<" + num1 + "<" + num3);
        }
        if (num3 < num2 && num2 < num1){
           System.out.println(num3 + "<" + num2 + "<" + num1);
        }
        if (num1 < num3 && num3 < num2){
            System.out.println(num1 + "<" + num3 + "<" + num2);
        }
        if (num2 < num3 && num3 < num1){
            System.out.println(num2 + "<" + num3 + "<" + num1);
        }
        if (num3 < num1 && num1 < num2){
            System.out.println(num3 + "<" + num1 + "<" + num2);
        }
     
 
    }
      
}