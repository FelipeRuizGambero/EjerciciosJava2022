
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mint
 */
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // N 1
        //N-1  2
        //...
        //1    N
        
        //Leer el teclado
        Scanner sc = new Scanner(System.in);
        int N;
        
        System.out.println("Introduzca un número N positivo:");
        N = sc.nextInt();
        
        //Ejecutar el proceso e ir mostrando la salida
        for(int i = 1; i<=N; i++){
            System.out.println(String.valueOf(N-(i-1))+ " " + String.valueOf(i));
        }
        System.out.println("-----------------------------");
        
        int j=N;
        for(int i =1; i<=N; i++){
            System.out.println(String.valueOf(j)+ " "+ String.valueOf(i));
            j--;
        }
    }
    
}
