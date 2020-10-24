package Persona;

public class Personas {
    private String nombre;
    private short edad;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
