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
public class CondBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        int impar;
        int par;
        
        System.out.println("Escribe un número impar");
        impar = lector.nextInt();
        
        System.out.println("Dame un número par");
        par = lector.nextInt();
        
        if(impar%2 !=0 && par%2 ==0){
        System.out.println("Gracias por su colaboración");
        }
        else if(par%2 ==0 || impar%2 !=0){
        System.out.println("Uno o más de los valores que ha escrito no son correctos.\n"+
                "\n"+
                "Ejecute de nuevo el programa para volver a intentarlo.");
            
        }
        else{
            System.out.println("No has dado ni una");
        }
     
        
    }
    
}
