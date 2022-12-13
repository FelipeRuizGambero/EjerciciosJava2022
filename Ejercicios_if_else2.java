/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;


public class Ejercicios_if_else2 {

    public static void main(String[] args) {
        /* Escribe un programa que calcule el salario semanal de un trabajador teniendo 
           en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 15 euros la hora. 
           A partir de la hora 41, se pagan a 20 euros la hora. Lee el número de horas trabajadas una semana 
        por un trabajador y calcula su retribución.
        */
         Scanner lector = new Scanner (System.in);
    
         int horas;
        
       System.out.println("¿Cuantas horas de trabajo se han dado?");
  
       horas = lector.nextInt();

         int z;
         int k;
         int y;
         y = (horas - 40) * 20;
         
       
        if (horas <= 40){
           z= horas * 15;
          System.out.println("El dinero dado por sus horas de trabajo es: " + z);
        }
        else if (horas < 40){
            k = 40 * 15 + y;
           System.out.println("El dinero dado por sus horas de trabajo es: " + k);
                   }
        else {
            System.out.println("Usted no ha hecho una mierda");
        }
        
   
        
        
    }
    
}
