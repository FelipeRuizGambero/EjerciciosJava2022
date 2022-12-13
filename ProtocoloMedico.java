package com.politecnicomalaga.EjerciciosDeJava;


import java.util.Scanner;

public class ProtocoloMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String respuesta;
        Scanner lector = new Scanner (System.in);
       
        
        
        System.out.println("Derrame pleural paraenumónico significativo");
        System.out.println("");
        System.out.println("Ecografía transtorácica");
        System.out.println("");
        //Primera pregunta para cambiar los caminos
        System.out.println("¿Complicado? (septos)"+ " S(Si), N (O caulquier otra letra, No)");
        respuesta = lector.nextLine();
        if (respuesta.equals("S")) {
            //Si ta complicado
             System.out.println("Drenaje pleural");
             System.out.println("+antibioterapia");
             System.out.println("+fibrinolíticos");
             
             System.out.println("¿Mala evolución en 49-72 hr?" + " S(Si), N (O caulquier otra letra, No)");
             respuesta = lector.nextLine();
             
             if (respuesta.equals ("S")){
                 //Hay mala evolución
                  System.out.println("Ecografía");
                  System.out.println("¿Persistencia de derrame y septos?" + " S(Si), N (O caulquier otra letra, No)");
                  respuesta = lector.nextLine();
                  
                  if (respuesta.equals("S")){
                      System.out.println("Videotoracoscopia");
                  }
                  else{
                      System.out.println("Continuar tratamiento");
                  }
             }
             else{
                 System.out.println("Continuar tratamiento");
             }
        }
        else{
            System.out.println("¿Dificultad respiratoria?" + " S(Si), N (O caulquier otra letra, No)");
            respuesta = lector.nextLine();
            
            if (respuesta.equals ("S")){
                System.out.println("Drenaje pleural + Antibioterapia");
            }
            else{
                System.out.println("¿>10 mm?" + " S(Si), N (O caulquier otra letra, No)");
                respuesta = lector.nextLine();
                
                if(respuesta.equals ("S")){
                    System.out.println("Toracocentesis diagnóstica");
                    
                    System.out.println("¿Pus o pH <7.2?");
                    respuesta = lector.nextLine();
                    
                    if(respuesta.equals("S")){
                        System.out.println("Drenaje pleural + Antibioterapia");
                        
                        System.out.println("¿Empeoramiento en siguientes 24-48 h?");
                       respuesta = lector.nextLine();
                    
                       if(respuesta.equals("S")){
                           System.out.println("amogus");
                       }
                       else{
                           System.out.println("Continuar tratamiento");
                       }
                        
                        
                    }
                    else{
                        System.out.println("Tratamiento conservador: Antibioterapia");
                        
                        System.out.println("¿Empeoramiento en siguientes 24-48 h?");
                        respuesta = lector.nextLine();
                    
                        if(respuesta.equals("S")){
                           System.out.println("amogus");
                        }
                        else{
                           System.out.println("Continuar tratamiento");
                        }
                    }
                }
                else{
                    System.out.println("Tratamiento conservador: Antibioterapia");
                    
                    System.out.println("¿Empeoramiento en siguientes 24-48 h?");
                       respuesta = lector.nextLine();
                    
                       if(respuesta.equals("S")){
                           System.out.println("amogus");
                       }
                       else{
                           System.out.println("Continuar tratamiento");
                       }
                }
            }
        }
        
        
        
        
        
        
        
    }
    
}
