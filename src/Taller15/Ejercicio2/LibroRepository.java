package Taller15.Ejercicio2;

public class LibroRepository {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro " + libro.getTitulo() + " en la base de datos.");
    }
}