package Persona;

public class Profesor  extends Personas{
    private String materiaDictada;
    private String institucionTrabajo;

    public String getMateriaDictada() {
        return materiaDictada;
    }

    public void setMateriaDictada(String materiaDictada) {
        this.materiaDictada = materiaDictada;
    }

    public String getInstitucionTrabajo() {
        return institucionTrabajo;
    }

    public void setInstitucionTrabajo(String institucionTrabajo) {
        this.institucionTrabajo = institucionTrabajo;
    }
    public void darClase()
    {
        System.out.println("El profesor"+ this.getNombre() + "Da la materia"+ materiaDictada);
    }
}
