package Taller15.Ejercicio1;

public class PersistenciaLibroService {

    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido guardado en la base de datos");
    }
}
