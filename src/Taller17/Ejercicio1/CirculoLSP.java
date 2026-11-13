package Taller17.Ejercicio1;

public class CirculoLSP extends FiguraGeometrica {
    private double radio;
    public CirculoLSP(double radio) { this.radio = radio; }
    @Override
    public double calcularArea() { return Math.PI * radio * radio; }
}
