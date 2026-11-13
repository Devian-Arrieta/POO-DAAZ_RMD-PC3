package Taller17.Ejercicio1;

public class RectanguloLSP extends FiguraGeometrica {
    protected double base, altura;
    public RectanguloLSP(double base, double altura) { this.base = base; this.altura = altura; }
    @Override
    public double calcularArea() { return base * altura; }
}
