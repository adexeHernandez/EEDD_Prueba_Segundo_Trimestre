/**
 * Clase que representa un libro dentro de una biblioteca.
 * Contiene información sobre el título, autor y año de publicación.
 *
 * @author Adexe Hernandez Vega
 * @version 7.3.2025
 */
public class Libro {

    //  Documentar estos atributos

    /** Titulo del libro */
    private String titulo;

    /** Autor del libro*/
    private String autor;

    /** Año de publicacion del libro*/
    private int anioPublicacion;


    //  Documentar este método
    // Testear este método
    /**
     * Constructor clase libro
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año de publicacion del libro
     * */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //  Documentar este método
    /**
     * Obtiene el autor del libro.
     *
     * @return Autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //  Documentar este método
    /**
     * Obtiene el año de publicación del libro.
     *
     * @return Año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
