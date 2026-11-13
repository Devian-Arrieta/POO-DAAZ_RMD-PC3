package Taller14.Ejercicio3;

public class Laptop extends Dispositivo {
    @Override
    public void encender() {
        super.encender(); // Llama exactamente a la misma implementación de la clase base
        // y es una mala practica porque es redundante
    }
}
