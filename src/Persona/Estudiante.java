package Persona;



public class Estudiante extends Personas{
    private short nroDeMaterias;
    private  String materiaCursada;

    public short getNroDeMaterias() {
        return nroDeMaterias;
    }

    public void setNroDeMaterias(short nroDeMaterias) {
        this.nroDeMaterias = nroDeMaterias;
    }

    public String getMateriaCursada() {
        return materiaCursada;
    }

    public void setMateriaCursada(String materiaCursada) {
        this.materiaCursada = materiaCursada;
    }

    public void asistirAClase(){
        System.out.println("El estudiante"+ this.getNombre() + "esta en:"+ materiaCursada);
    }
    public void realizarTrabajos(){
        System.out.println("El estudiante"+ this.getNombre() + "esta en realizando una actividad");
    }
}
