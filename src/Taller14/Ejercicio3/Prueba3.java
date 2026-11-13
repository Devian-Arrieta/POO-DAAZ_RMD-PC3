import Taller14.Ejercicio3.Dispositivo;
import Taller14.Ejercicio3.Telefono;

void main() {

    Dispositivo miDispositivo = new Telefono();
    miDispositivo.encender();  // Encender existe dentro de su clase
    // miDispositivo.tomarFoto(); // Error de compilación ya que intenta acceder a un metodo que no está definido en Dispositivo
}