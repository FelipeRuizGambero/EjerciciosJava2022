
/*import java.util.Scanner;


public class Vacaciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //boolean de aplicaciones
        boolean continuar = true;
        String opcion;
        Scanner Sc = new Scanner (System.in);
        Vacaciones programa = new Vacaciones();
        
        
        while(continuar){
                System.out.println("");
                System.out.println("Vacaciones en la costa del sol");
                System.out.println("");
                System.out.println("Datos del hotel : 1");
                System.out.println("Mostrar listado de clientes : 2");
                System.out.println("Cualquier otra opción, salir");
                
        //Pedir nueva opción
                 opcion = Sc.nextLine();
                 
          switch (opcion) {
            case "1": programa.DatosH();
             break;
            case "2": programa.ListaH();
             break;
            default: continuar = false;
                    
         }
        }
    }  
    public void DatosH() {
        //Mostrar datos de hotel
        public class Hotel {
            private String descripcion;
            private String nombre;
            private String direccionPostal;
            private String telefono;
            private String email;
            
            public Hotel(String desc, String nom, String post, String telf, String mail){
                this.descripcion = desc;
                this.nombre = nom;
                this.direccionPostal = post;
                this.email = mail;
            }
            
            
            
            public String mostrarDatos(){
                String datos;
                datos = "Los datos son: \n";
                datos+= this.descripcion + "\n";
                datos+= this.nombre + "\n";
                datos+= this.direccionPostal + "\n";
                datos+= this.email + "\n";
                
                return datos;
                
            }
        }
   
    public void ListaH() {
        //Mostrar listado de clientes
        int n = 1;
        
        do{
            System.out.println(n +""+nom);
            n++;
        }
        while(n < Client);
        //Añadir cliente a la lista con sus datos
        Scanner lector = new Scanner (System.in);
        int reserva;
        
        System.out.println("¿Quieres hacer una reserva?"+ "0"+ " o "+"¿Quieres cancelar tu reserva?"+" 1");    
        reserva = lector.nextInt();
        
        if(reserva == 0){
            
            
        }
        else if (reserva == 1){
            
        }
        else{
            
        }
       
        //Quitar cliente a la lista
        
    }
}
*/