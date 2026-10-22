public abstract class Contenido {

    private string titulo; 
    private string autor;

    public contenido(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String tipo();

    @Override
    public String toString() {
        return tipo() + ": " + titulo + " - " + autor;
    }
}
