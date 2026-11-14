package Taller16.Ejercicio1;

public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;
    public DescuentoPorcentaje(double porcentaje) { this.porcentaje = porcentaje; }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * (porcentaje / 100));
    }
}