
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
    int min, max, num;
    int suma = 0;
    int M = 0;
    int N = 0;
    int O = 0;
    int P = 0;
    
    
    
    System.out.println("Introduzca tu número mínimo");
    min = sc.nextInt();
    System.out.println("Introduzca tu número máximo");
    max = sc.nextInt();
    
    
    
    //introducir los números min y max
    if (max < min){
    do{
        System.out.println("Introduzca tu número mínimo");
        min = sc.nextInt();
        System.out.println("Introduzca tu número máximo");
        max = sc.nextInt();
        //Cuenta cuando se equivoca max < min
        M++;
    }
    while (max < min);
    }
    
    else {
       do{
          System.out.println("Introduce un número (cero para acabar)");
          num = sc.nextInt(); 
             if(num < max && num > min){
                 //Entre el max y minç
                 suma = suma + num;
                 N++;
             }
             else if (num > max || num < min){
                 //Cuenta cuando el número se aleja de max y min
                 O++;
                 
             }
             else{
                 //Cuenta los max y min
                 P++;
                System.out.println("Has escrito los números iguales a los límites");
             }
       } 
       while(num !=0);
    }
    System.out.println("Contador:");
    System.out.println("Números dentro del intervalo: "+ N);
    System.out.println("Número total de elecciones dentro del intervalo: " + suma);
    System.out.println("Fuera del intervalo: "+O);
    System.out.println("Números elegidos as limites: "+P);
    System.out.println("Se equivoco de posición con max y min: "+M);
}
}
