package Taller16.Ejercicio3;

public class PushMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) { System.out.println("Enviando Notificación Push: " + mensaje); }
}