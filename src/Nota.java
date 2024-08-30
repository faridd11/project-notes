
import java.io.Serializable;

public class Nota implements Serializable {
    private String titulo;
    private String contenido;

// Suggested code may be subject to a license. Learn more: ~LicenseLog:751124024.
public Nota(String titulo, String contenido) {
    this.titulo = titulo;
    this.contenido = contenido;
}


   
    public String getTitulo() {
        return titulo;
    }

    public String getContenido(){
        return contenido;
    }

    public String toString(){
        return "Titulo: " + getTitulo() + "\nContenido: " + getContenido();
    }


}

