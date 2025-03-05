package org.example;

import biblioteca.Biblioteca;
import biblioteca.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("La gran mentira","Alfonso Perez",1985);
        biblioteca.agregarLibro(libro1);

        Libro libro2 = new Libro("Sutil", "Maria Soren", 2002);
        biblioteca.agregarLibro(libro2);

        Libro libro3 = new Libro("Otoño", "Edgar Climent", 2020);
        biblioteca.agregarLibro(libro3);




    }
}