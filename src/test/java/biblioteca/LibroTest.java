package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    Libro libro;

    @BeforeEach
    void setUp() {
        libro = new Libro("Renacido", "Keth Marian", 1989);
    }

    @Test
    void getTitulo() {
        assertEquals("Renacido", libro.getTitulo());
    }

    @Test
    void setTitulo() {
        libro.setTitulo("Confused");
        assertEquals("Confused", libro.getTitulo());
    }

    @Test
    void getAutor() {
        assertEquals("Keth Marian", libro.getAutor());
    }

    @Test
    void setAutor() {
        libro.setAutor("Mariam Rojas");
        assertEquals("Mariam Rojas", libro.getAutor());
    }

    @Test
    void getAnioPublicacion() {
        assertEquals(1989, libro.getAnioPublicacion());
    }

    @Test
    void setAnioPublicacion() {
        libro.setAnioPublicacion(1999);
        assertEquals(1999, libro.getAnioPublicacion());
    }
}