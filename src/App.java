import java.util.*;
public class App {
    public static void main(String[] args) throws Exception { 
        Scanner ingresar = new Scanner(System.in);
        Scanner entero = new Scanner(System.in);
      /*  Nota unaNota = new Nota("Dia 1");
       LocalStorage.setItem("nota1.txt", unaNota);

       Nota otraNota = (Nota) LocalStorage.getItem("nota1.txt");
       System.out.println(otraNota); */

     /* Nota miNota = new Nota ("Boca", "Es el más grande del mundo");
     LocalStorage.setItem("boquita.txt", miNota);
      
     Nota notaRecuperada = (Nota) LocalStorage.getItem("boquita.txt");
     System.out.println(notaRecuperada);


    

     System.out.println("Ingrese el titulo de la nota");
     String titulo = ingresar.nextLine();

     System.out.println("Ingrese el contenido de la nota");
     String contenido = ingresar.nextLine();

     Nota miNota2 = new Nota(titulo, contenido);

     LocalStorage.setItem("prueba.txt", miNota2);

     Nota notaRe = (Nota) LocalStorage.getItem("prueba.txt");

     System.out.println(notaRe);

     ingresar.close(); */



     System.out.println("Seleccione una opción:");
        System.out.println("1. Crear nota");
        System.out.println("2. Ver nota");
        System.out.println("3. Salir");

        int opcion = entero.nextInt();
        entero.nextLine();

        switch (opcion) {
            case 1:
            System.out.println("Ingrese el titulo de la nota");
            String titulo = ingresar.nextLine();

            System.out.println("Ingresa el contenido: ");
            String contenido = ingresar.nextLine();
                
            Nota miNota = new Nota(titulo, contenido);
            LocalStorage.setItem("definitiva.txt", miNota);
            System.out.println("Nota almacenada correctamente"); 
                break;
             
             case 2:
             Nota notaRecup = (Nota) LocalStorage.getItem("definitiva.txt");  
             System.out.println(notaRecup); 
                break;
             
             case 3:
             System.out.println("Saliendo de notas"); 
             break;  
            default:
            System.out.println("Opcion no valida");
                break;
        }
        ingresar.close();
        entero.close();


     



       

        

    }
}
