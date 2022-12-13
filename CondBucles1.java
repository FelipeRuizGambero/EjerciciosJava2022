/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.politecnicomalaga.EjerciciosDeJava;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class CondBucles1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner lector = new Scanner (System.in);
        int par;
        int impar;
        
        System.out.println("Dame un número par");
        par = lector.nextInt();
        impar = lector.nextInt();
        
        if (par%2 == 0){
            System.out.println("Dame un número impar");
            
        }
        else{
            System.out.println("Eso no es un número par");
        }
        
        
        if(impar%2 !=0){
            System.out.println("Gracias por su colaboración");
        }
        else{
            System.out.println("Ese no es un número impar");
        }
    }
    
}
