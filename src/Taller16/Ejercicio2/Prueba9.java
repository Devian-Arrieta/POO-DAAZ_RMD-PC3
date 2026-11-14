import Taller16.Ejercicio2.*;

void main() {

    GestorExportacion gestor = new GestorExportacion();

    Documento docPdf = new DocumentoPDF("Informe_Anual", "Resumen financiero 2026");
    Documento docWord = new DocumentoWord("Contrato_Servicios", "Cláusulas del contrato");
    Documento docExcel = new DocumentoExcel("Inventario_General", "Listado de productos");

    gestor.procesarExportacion(docPdf);
    gestor.procesarExportacion(docWord);
    gestor.procesarExportacion(docExcel);
}