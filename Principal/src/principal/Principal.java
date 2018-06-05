
package principal;
import java.util.Scanner;
import java.util.Date;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Datos datosLibros []=new Datos [10];
         boolean opcion=false;
        do{
           opcion=false;
        for(int i=0; i<datosLibros.length; i++){
            Datos datos1;
          
            System.out.println("Por favor ingrese los datos de el libro "+(i+1));
           
            System.out.println("Titulo:");
            String titulo=scan.nextLine();
            System.out.println("Autor");
            String autor=scan.nextLine();
                System.out.println("Año:");
                int año=scan.nextInt();
                System.out.println("Favorito:");
                String favorito=scan.nextLine();
        }
        }while(opcion);
                Autor autor1[]=new Autor[10];
                for (int j=0; j<autor1.length; j++){
                    System.out.println("Datos del autor del libro "+(j+1));
                    System.out.println("Nombre:");
                    String nombre=scan.nextLine();
                    System.out.println("Pais");
                    String pais=scan.nextLine();
                }
                System.out.println("Informacion: "+datosLibros[1]);
                System.out.println("Informacion: "+datosLibros[2]);
                System.out.println("Informacion: "+datosLibros[3]);
                System.out.println("Informacion: "+datosLibros[4]);
                System.out.println("Informacion: "+datosLibros[5]);
                System.out.println("Informacion: "+datosLibros[6]);
                System.out.println("Informacion: "+datosLibros[7]);
                System.out.println("Informacion: "+datosLibros[8]);
                System.out.println("Informacion: "+datosLibros[9]);
                
        
    }
    
    
        }
