package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("Renacido","Keth Marian",1989);
    }

    @Test
    void agregarLibro() {
        biblioteca.agregarLibro(libro);
        assertTrue(biblioteca.getLibros().contains(libro));
    }

    @Test
    void eliminarLibro() {
        biblioteca.eliminarLibro(libro);
        assertFalse(biblioteca.getLibros().contains(libro));
    }

    @Test
    void getLibros() {
    }

    @Test
    void encuentraLibroPorTitulo() {
    }

    @Test
    void encuentaLibroPorAutor() {
    }

    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);

        // No esta vacia
        assertNotNull(biblioteca.getLibros());
        // Solo tiene un libro
        assertEquals(biblioteca.getLibros().size(), 1);
        // Contiene el libro recien añadido
        assertTrue(biblioteca.getLibros().contains(this.libro));
    }
}