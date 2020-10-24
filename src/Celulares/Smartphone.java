package Celulares;

public class Smartphone extends Celular {
    private String sistemaOperativo;
    private String debloqueo;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getDebloqueo() {
        return debloqueo;
    }

    public void setDebloqueo(String debloqueo) {
        this.debloqueo = debloqueo;
    }
    public void tomarFotos()
    {
        System.out.println("Acaba de tomar Una foto");

    }
    public void reproductorMusica()
    {
        System.out.println("Reproductor de musica");
    }
    public void accederInternet()
    {
        System.out.println("En estos momentos esta navegando en Internet");
    }
    public void reproductorVideos()
    {
        System.out.println("Reproductor de Vidios");
    }
}
