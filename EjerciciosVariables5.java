/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;

public class EjerciciosVariables5 {

    public static void main(String[] args) {
    
       String nombre;
       String direccion;
       String telefono;

    Scanner lector = new Scanner (System.in);

    System.out.println("¿Cual es tu nombre?");
    nombre = lector.nextLine();
    
    System.out.println("¿Cual es tu dirección?");
    direccion = lector.nextLine();

    System.out.println("¿Cual es tu teléfono?");
    telefono = lector.nextLine();

System.out.println("El nombre es " + nombre);

System.out.println("La dirección es " + direccion);

System.out.println("El teléfono es " + telefono);
        
        
        
        
        
        
        
        
    }
    
}
