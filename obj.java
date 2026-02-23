public class Obj 
{
    private String nombre;
    private double vr;
    private int cant;

    public Obj() {
    }

    public Obj(String nombre, double vr, int cant) 
    {
        this.nombre = nombre;
        this.vr = vr;
        this.cant = cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVr() {
        return vr;
    }

    public void setVr(double vr) {
        this.vr = vr;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
