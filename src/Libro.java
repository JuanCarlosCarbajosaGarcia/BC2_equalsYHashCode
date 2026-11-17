import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "[ Titulo: " + titulo +
                ", Autor: " + autor +
                ", Anio: " + anio +
                " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anio == libro.anio && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, anio);
    }
}
