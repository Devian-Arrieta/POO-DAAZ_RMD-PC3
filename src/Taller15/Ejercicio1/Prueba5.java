import Taller15.Ejercicio1.Libro;
import Taller15.Ejercicio1.PersistenciaLibroService;
import Taller15.Ejercicio1.ReporteLibroService;

void main() {

    Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 456);

    ReporteLibroService reporteService = new ReporteLibroService();
    PersistenciaLibroService persistenciaService = new PersistenciaLibroService();

    reporteService.generarReporte(libro1);
    persistenciaService.guardarEnBaseDeDatos(libro1);
}