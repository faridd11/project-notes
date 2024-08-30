import java.io.*;
public class LocalStorage {
    public static void setItem(String titulo, Object objeto){
        try{
            FileOutputStream archivoSali = new FileOutputStream(titulo);
            ObjectOutputStream objSalida = new ObjectOutputStream(archivoSali);

            objSalida.writeObject(objeto);
            objSalida.close();
            archivoSali.close();
            System.out.println("Guardado");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static Object getItem(String nombreArchivo){
        Object objectoDeserea = null;
        try{
            FileInputStream archivoEntra = new FileInputStream(nombreArchivo);
            ObjectInputStream objetEntra = new ObjectInputStream(archivoEntra);

            objectoDeserea = objetEntra.readObject();
            objetEntra.close();
            archivoEntra.close();
            System.out.println("Obj convertido en archivo");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objectoDeserea;
    }

}
