package Taller16.Ejercicio2;

public class DocumentoExcel extends Documento {
    public DocumentoExcel(String titulo, String contenido) {
        super(titulo, contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando '" + titulo + ".xlsx' en formato Excel");
    }
}
