package Taller16.Ejercicio2;

public abstract class Documento {
    protected String titulo;
    protected String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public abstract void exportar();
}


/*

public class Documento {

    private String titulo;
    private String contenido;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public void exportarPDF() {
        System.out.println("Exportando '" + titulo + "' a formato PDF...");
        System.out.println("Contenido: " + contenido);
    }

}

 */
