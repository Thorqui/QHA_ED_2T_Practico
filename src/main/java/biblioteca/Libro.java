package biblioteca;

/**
 * Clase que representa un libro con titulo, autor y año de su publicaicon
 *
 *  @author Aitor QUilez Herrero (AKA: Thorqui via GitHub)
 *   @version 5.3.2025
 */
public class Libro {

    // TODO: Documentar estos atributos
    /** Titulo del libro */
    private String titulo;

    /** Autor de un libro */
    private String autor;

    /** Año de la publicacion de un libro */
    private int anioPublicacion;

    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor que crea un nuevo libro con el titulo, autor y año de la publicacion
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param anioPublicacion Año en el que fue publicado el libro
     */
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

    // TODO: Documentar este método

    /**
     * Obtiene el autor del libro
     * @return Autor del libro
     */
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Obtiene el año de publicacion de un libro determinado
     * @return Año de publicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
