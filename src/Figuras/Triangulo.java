package Figuras;

public class Triangulo extends FigurasGeometricas {
    private String angulos;
    private double altura;
    private double base;
    private String clasificacion;

    public String getAngulos() {
        return angulos;
    }

    public void setAngulos(String angulos) {
        this.angulos = angulos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
