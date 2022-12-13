
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mint
 */
public class TriajeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean continuar = true;
        String opcion;
        Scanner ScMenu = new Scanner (System.in);
        TriajeJava programa = new TriajeJava();
        
        while(continuar){
            System.out.println("");
            System.out.println("Examen programación");
            System.out.println("Segundo ejercicio de evaluación");
            System.out.println("");
            System.out.println("Escoja ejercicio a realizar");
            System.out.println("1. Triaje");
            System.out.println("2. limite inferior/superior");
            System.out.println("3. dado un número...");
             System.out.println("Cualquier otra entrada: SALIR");
             
            opcion = ScMenu.nextLine();
            switch (opcion) {
                case "1":programa.TriajeJ();
                 break;
                case "2":programa.limiteJ();
                 break;
                case "3":programa. numeroJ();
                 break;
            default: continuar = false;
        } 
    } 
}
public void TriajeJ(){
Scanner sc = new Scanner(System.in);
int camina,respira,fresp,radial,pulso,reposicion;
int negro,rojo,amarillo,verde;
negro = 0;
rojo  = 0;
amarillo = 0;
verde = 0;
 
System.out.println("Triaje start");
System.out.println("");
System.out.println("¿El paciente puede caminar? Si: 1 No: 2");
camina = sc.nextInt();

if (camina == 1){
   System.out.println("Prioridad 3 verde");
   verde++;
}
 else if (camina == 2){
    System.out.println("¿Respira? Si: 1 No: 2");
         respira = sc.nextInt();
         if  (respira == 1){
             System.out.println("¿tiene una FR (frecuencia respiratoria)\n" +
                                "mayor a 30 veces por minuto?");
             fresp = sc.nextInt();
                     
                     if(fresp > 30){
                          System.out.println("Prioridad 1 rojo");
                          rojo++;
                      }
                      else{
                          System.out.println("¿Tiene pulso radial? Si:1  No:2");
                                radial = sc.nextInt();
                               
                                if(radial == 1){
                                    System.out.println("¿Está orientado el pulso? Si:1  No:2");
                                     pulso = sc.nextInt();
                                     
                                     if(pulso == 1){
                                         System.out.println("Prioridad 2 amarillo");
                                         amarillo++;
                                     }
                                     if(pulso == 2){
                                         System.out.println("Prioridad 1 rojo");
                                         rojo++;
                                     }
                                     if (pulso > 2 || pulso < 1){
                                         System.out.println("Profavor indique uno de los números");
                                         sc.reset();
                                         
                                     }
                                    
                                }
                                if(radial == 2){
                                    System.out.println("Controle la hemorragia");
                                    System.out.println("Prioridad 1 rojo");
                                    rojo++;
                                }
                                if (radial > 2 || radial < 1){
                                    System.out.println("Profavor indique uno de los números");
                                    sc.reset();
                                }
                      } 
         }               
         
         if (respira == 2){
             System.out.println("¿Haciendo maniobras de reposición respira? Si:1  No:2");
             reposicion = sc.nextInt();
                  if(reposicion == 1){
                      System.out.println("Prioridad 1 rojo");
                      rojo++;
                  }
                  if(reposicion == 2){
                      System.out.println("Prioridad 0 negro");
                      negro++;
                  }
                  if(reposicion > 2 || reposicion < 1){
                      System.out.println("Profavor indique uno de los números");
                     
                  }
         }
         if (respira > 2 || respira < 1){
             System.out.println("Profavor indique uno de los números");
           
         }
}
else{
    System.out.println("Profavor indique uno de los números");
    
}

System.out.println("Valores de negro" + negro);
System.out.println("Valores de rojo"+ rojo);
System.out.println("Valores de amarillo"+ amarillo);
System.out.println("Valores de verde"+ verde);
}
    
public void limiteJ(){
    Scanner sc = new Scanner(System.in);
    int min;
    int max;
    int num;
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
                 suma = suma + num;
             }
             else{
                 //Cuenta los max y min
                 P++;
                 suma = suma + num;
             }
       } 
       while(num !=0);
    }
    System.out.println("Contador:");
    System.out.println("Números dentro del intervalo: "+ N);
    System.out.println("Número total de elecciones: " + suma);
    System.out.println("Fuera del intervalo: "+O);
    System.out.println("Números elegidos: "+P);
    System.out.println("Se equivoco de posición con max y min: "+M);
}

public void numeroJ(){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Dame un número n");
    n = sc.nextInt();
    
    int m = 1;
    int i = n;
    
    do{
            System.out.println(  m+"_"+i);
            
            i--;
            m++;
        }
        while (i < n);
        
    
}
}