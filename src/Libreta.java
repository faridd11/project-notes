
public class Libreta {
    private Nota nota;

    public void setNota(Nota no){
        this.nota = no;
    }

    public Nota getNota() {
        return nota;
    }

    @Override
    public String toString(){
        return "Nota: " + getNota();
    }
}