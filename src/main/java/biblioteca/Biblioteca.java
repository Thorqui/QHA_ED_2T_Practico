package biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una coleccion de libros
 * Permite agregar, eliminiar y buscar libros por titulo y por autor
 *
 * @author Aitor QUilez Herrero (AKA: Thorqui via GitHub)
 * @version 5.3.2025
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de libros disponibles en la biblioteca */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de la biblioteca sin libros */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
// Test: NO HAY QUE TESTEAR ESTE METODO
    /**
     * Constructor con parametros
     * @param libros Lista de libros la cual inicializa la biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
// Test: Comprobar si se ha agregado
    /**
     *  Agrega un libro a la biblioteca
     * @param libro Un libro para agregarlo
     *
     * @return {@code true} si el libro se ha agregado correctamente o {@code false} si el libro NO se ha agregado correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
    /**
     * Devuelve la lista de libros de la biblioteca
     * Elimina un libro de la biblioteca
     * @param libro Un libro para eliminar
     * @return {@code true} si el libro se ha eliminado correctamente o {@code false} si el libro NO se ha eliminado correctamente
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista completa de libros de la biblioteca
     * @return Lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     * Busca un libro por el titulo
     * @param titulo Cadena de texto con el titulo del libro
     * @return Devuelve el titulo
     * @Test 01 Busca un libro existente y comprueba que lo localiza
     * @Test 02 Busca un libro NO existente y comprueba que NO lo localiza
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated Este metodo ha quedado obsoleto
     * se recomiendo usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor
     * @return
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test 01: Comprobar la lista de libros que devuelve para un autor existentes.
// Test 02: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Busca todos los libros de un autor determinado
     * Sustituye al metodo {@link #encuentaLibroPorAutor(String)}
     * @param autor Autor que se deseean buscar sus libros
     * @return Lista de libros del autor deseado
     * @Test 01 Comprueba la lista de libros que devuelve para un autor existente
     * @Test 02 Comprueba la lista de libros que devuelve para un autor NO existente
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
