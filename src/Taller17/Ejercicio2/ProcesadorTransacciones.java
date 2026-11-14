package Taller17.Ejercicio2;

public class ProcesadorTransacciones {

    public void procesar(CuentaBancaria cuenta, double montoDeposito, double montoRetiro) {
        cuenta.depositar(montoDeposito);
        cuenta.retirar(montoRetiro);
        System.out.println("Saldo final: $" + cuenta.getSaldo() +"\n");
    }

}
