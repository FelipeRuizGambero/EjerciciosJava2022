
import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tengo dos trabajos principales y después de cada uno de ellos, otros 
        //trabajos más "pequeños" o dependientes del primero
        int limiteInf, limiteSup;
        int contador = 0;
        int numero;
        int suma = 0;
        int outL = 0;
        int igual = 0;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        //1º recoger los límites hasta que me los den correctamente
        do {
            if (contador>0){
                System.out.println("Ha introducido los datos mal");
            }
            
            System.out.println("Introduce limite inferior: ");
            limiteInf = sc.nextInt();
            System.out.println("Introduce el límite superior: ");
            limiteSup = sc.nextInt();
            contador++;
            
        } while(limiteInf>=limiteSup);
        
        
        System.out.println("Los límites son:" + String.valueOf(limiteInf)+ " : "+ String.valueOf(limiteSup));
        
        //2º recoger los datos hasta que introduzcan el cero
        do {
              System.out.println("Introduzaca datos hasta poner un cero (finalizar): ");
           numero=sc.nextInt();
        if(numero !=0){
     
           if(numero > limiteInf && numero < limiteSup){
          //2ºa mirar si el dato es interior
          suma = suma + numero;
           }
           else if(numero == limiteInf || numero == limiteSup){
          //2ºb si no hay que mirar si son los límites
          System.out.println("Has escrito los números iguales a los límites");
          igual++;
           }
           else{
          //2ºc si no está fuera
          outL++;
           }
        }
          else{
              continuar = false;
         }
        } while (continuar);
         
        //Mostrar la salida del proceso
        System.out.println("La suma de los números dentro del intervalo es: "+ suma);
        System.out.println("la cantidad de limites escrito son: "+igual);
        System.out.println("La cantidad de numeros fuera del intervalo son:"+outL);
    }
    
}
