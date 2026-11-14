package Taller16.Ejercicio3;

public class SMSMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) { System.out.println("Enviando SMS: " + mensaje); }
}
