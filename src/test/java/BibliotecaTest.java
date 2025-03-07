import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * Clase de pruebas la clase {@link Biblioteca}.
 * Se validan los métodos de agregar, eliminar y buscar libros en la biblioteca.
 */
class BibliotecaTest {
    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;


    /**
     * Configura el entorno de prueba antes de cada test.
     * Se inicializa una biblioteca vacía y se crean libros de prueba.
     */
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
        libro1 = new Libro("Aprendiendo Git y GitHub", "Midudev", 2024);
        libro2 = new Libro("Clean Code", "Robert C. Martin", 2008);
    }

    /**
     * Prueba el método {@link Biblioteca#agregarLibro(Libro)}.
     * Verifica que un libro se agregue correctamente a la biblioteca.
     */
    @Test
    void testAgregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1));
        assertTrue(biblioteca.getLibros().contains(libro1));
    }

    /**
     * Prueba el método {@link Biblioteca#eliminarLibro(Libro)}.
     * Verifica que un libro se elimine correctamente de la biblioteca.
     */
    @Test
    void testEliminarLibro() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.eliminarLibro(libro1));
        assertFalse(biblioteca.getLibros().contains(libro1));
    }

    /**
     * Prueba el método {@link Biblioteca#encuentraLibroPorTitulo(String)}.
     * Verifica que un libro existente pueda ser encontrado por su título.
     */
    @Test
    void testEncuentraLibroPorTitulo_Existente() {
        biblioteca.agregarLibro(libro2);
        assertEquals(libro2, biblioteca.encuentraLibroPorTitulo("Clean Code"));
    }

    /**
     * Prueba el método {@link Biblioteca#encuentraLibroPorTitulo(String)} con un título inexistente.
     * Verifica que retorne {@code null} si el libro no está en la biblioteca.
     */
    @Test
    void testEncuentraLibroPorTitulo_NoExistente() {
        assertNull(biblioteca.encuentraLibroPorTitulo("No existe"));
    }


    /**
     * Prueba el método {@link Biblioteca#encuentraLibrosPorAutor(String)}.
     * Verifica que se encuentren correctamente los libros de un autor existente.
     */
    @Test
    void testEncuentraLibrosPorAutor_Existente() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(new Libro("Aprendiendo Git y GitHub", "Midudev", 2024));

        List<Libro> resultado = biblioteca.encuentraLibrosPorAutor("Midudev");
        assertEquals(2, resultado.size());
    }

    /**
     * Prueba el método {@link Biblioteca#encuentraLibrosPorAutor(String)} con un autor inexistente.
     * Verifica que retorne {@code null} si no hay libros del autor buscado.
     */
    @Test
    void testEncuentraLibrosPorAutor_NoExistente() {
        List<Libro> resultado = biblioteca.encuentraLibrosPorAutor("Autor Desconocido");
        assertNull(resultado);
    }
}