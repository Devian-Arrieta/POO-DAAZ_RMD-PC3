package Taller15.Ejercicio1;

public class ReporteLibroService {

    public void generarReporte(Libro libro) {
        System.out.println("REPORTE DEL LIBRO");
        libro.obtenerInformacion();
    }
}
