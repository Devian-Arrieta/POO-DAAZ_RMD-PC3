import Taller17.Ejercicio2.CuentaAhorros;
import Taller17.Ejercicio2.CuentaBancaria;
import Taller17.Ejercicio2.ProcesadorTransacciones;

void main() {

    ProcesadorTransacciones procesador = new ProcesadorTransacciones();

    CuentaBancaria cuentaBase = new CuentaBancaria(50000);
    CuentaBancaria cuentaAhorros = new CuentaAhorros(50000, 0.05);

    procesador.procesar(cuentaBase, 200000, 15000);
    procesador.procesar(cuentaAhorros, 350000, 100000);

    CuentaAhorros ahorrosEspecializada = new CuentaAhorros(1000000, 0.03);
    ahorrosEspecializada.aplicarInteres();
    
}
