package Taller16.Ejercicio3;

public class EmailMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) { System.out.println("Enviando Correo electrónico: " + mensaje); }
}