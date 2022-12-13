/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;

public class Ejercicios_if_else1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
    
    int time;
           
       System.out.println("¿Que hora es?");
  
       time = lector.nextInt();
       
       if (time < 1 || time > 7){
           System.out.println("Eso no es un día de la semana");
       }
       if (time == 1){
           System.out.println("Hoy es lunes");
       }
         if (time == 2){
           System.out.println("Hoy es martes");
       }
         if (time == 3){
           System.out.println("Hoy es miércoles");
       }
         if (time == 4){
           System.out.println("Hoy es jueves");
       }
         if (time == 5){
           System.out.println("Hoy es viernes");
       }
         if (time == 6){
            System.out.println("Hoy es sábado");
         }
         else {
            System.out.println("Hoy es domingo");
       }
         
    }
}
