
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class EjercicosBucles1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner lector = new Scanner (System.in);
       int num;
        int i = 0;
      
       System.out.println("Escribe numero entero");
        num = lector.nextInt();
        
    
       while (i < 10) {
        System.out.println(num * i);
        i++;
       }
    } 
}
