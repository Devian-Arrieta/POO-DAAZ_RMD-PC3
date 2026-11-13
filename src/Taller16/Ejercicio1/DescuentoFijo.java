package Taller16.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double valorFijo;
    public DescuentoFijo(double valorFijo) { this.valorFijo = valorFijo; }

    @Override
    public double aplicarDescuento(double monto) {
        return Math.max(0, monto - valorFijo);
    }
}
