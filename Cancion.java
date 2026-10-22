
public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    @Override
    public String tipo() {
        return "Canción";
    }

    @Override
    public int getDuracionSeg() {
        return duracionSeg;
    }

    @Override
    public void reproducir() {
        int min = duracionSeg / 60;
        int seg = duracionSeg % 60;

        System.out.println("Reproduciendo canción: " + getTitulo()
                + " (" + min + ":" + String.format("%02d", seg) + ")");
    }

    @Override
    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.5;
    }
}
