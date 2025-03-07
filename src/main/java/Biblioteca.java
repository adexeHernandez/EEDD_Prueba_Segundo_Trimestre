import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una colección de libros
 * Permite agregar, eliminar y buscar libros por título y por autor
 *
 * @see Libro
 * @author Adexe Hernandez Vega
 * @version 7.3.2025
 */
public class Biblioteca {

    // Documentar estos atributos
    /** Lista de libros disponibles en la biblioteca */
    private final List<Libro> libros;

    // Documentar este método
    /** Constructor por defecto de la biblioteca sin libros */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //  Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /** Constructor con parámetros.
     *
     * @param libros Lista de libros con la que se iniciliza la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    //  Testear este metodo.
    //  Test: Comprobar si se ha agregado
    /**
     * Agrega un libro a la biblioteca
     * @param libro Un libro para agregar
     *
     * @return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro NO se ha agregado
     * correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     * Elimina un libro a la biblioteca
     * @param libro Un libro para eliminar
     *
     * @return {@code true} si el libro se ha eliminado correctamente o {@code false} si el libro NO se ha eliminado
     * correctamente
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    //  Documentar este método

    public List<Libro> getLibros() {
        return libros;
    }
    /**
     * Obtiene la lista de libros de la biblioteca.
     *
     * @return Lista de libros en la biblioteca.
     */
    //  Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca un libro en la biblioteca por su título.
     *
     * @param titulo El título del libro a buscar.
     * @return El libro si se encuentra en la biblioteca, o {@code null} si no existe.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    //  Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**
     * Método obsoleto para buscar un libro por autor.
     *
     * @param autor El autor del libro a buscar.
     * @return El primer libro encontrado con el autor dado, o {@code null} si no se encuentra.
     *
     * @deprecated Este método está obsoleto desde la versión 2.0. Usar {@link #encuentraLibrosPorAutor(String)}.
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    //  Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    //  Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Busca todos los libros de un autor en la biblioteca.
     * Este método sustituye a {@link #encuentaLibroPorAutor(String)} y está disponible desde la versión 2.0.
     *
     * @param autor El autor de los libros a buscar.
     * @return Una lista de libros escritos por el autor. Devuelve {@code null} si no se encuentran libros.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}