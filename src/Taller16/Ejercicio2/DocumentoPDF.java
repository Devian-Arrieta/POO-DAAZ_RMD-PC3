package Taller16.Ejercicio2;

public class DocumentoPDF extends Documento {

    public DocumentoPDF(String titulo, String contenido) {
        super(titulo, contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando '" + titulo + ".pdf' en formato PDF");
    }
}
