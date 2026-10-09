package constructores;

public class plato {

    private int idPlato;
    private String nombre;
    private double precio;
    private TipoPlato tipo;

    public plato(int idPlato, String nombre, double precio, TipoPlato tipo) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "plato{" +
                "idPlato=" + idPlato +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
