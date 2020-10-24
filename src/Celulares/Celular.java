package Celulares;

public class Celular {
    private String marca;
    private String serial;
    private String referencia;
    private double dimenciones;

    public String getMarca() {
        return marca;
    }

    public String getSerial() {
        return serial;
    }

    public String getReferencia() {
        return referencia;
    }

    public double getDimenciones() {
        return dimenciones;
    }
    public void realizarLlamadas(String numero)
    {
        System.out.println("El numero al que va a llamar" + numero);
    }
    public void recibirLlamadas(String numero)
    {
        System.out.println("El numero te esta llamando " + numero);
    }
}
