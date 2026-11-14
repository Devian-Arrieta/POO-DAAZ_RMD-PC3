package Taller17.Ejercicio2;

public class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado. Saldo actual: $" + saldo);
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado. Saldo actual: $" + saldo);
            return true;
        }
        System.out.println("Retiro rechazado: monto inválido o saldo insuficiente.");
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
