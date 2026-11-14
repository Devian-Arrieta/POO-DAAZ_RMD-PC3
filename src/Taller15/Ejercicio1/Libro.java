package Taller15.Ejercicio1;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void obtenerInformacion() {
        System.out.println(
                "Título: " + titulo +"\n"+
                "Autor: " + autor + "\n"+
                "Número de páginas: " + numeroPaginas
        );
    }


    /*

    // sin SRP

    public void generarReporte() {
        System.out.println("REPORTE DEL LIBRO");
        obtenerInformacion();
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("El libro '" + titulo + "' ha sido guardado en la base de datos");
    }
     */
}
