import Taller14.Ejercicio1.Circulo;
import Taller14.Ejercicio1.Figura;
import Taller14.Ejercicio1.Rectangulo;

void main() {

  Figura figura1 = new Circulo(5);
  Figura figura2 = new Rectangulo(4, 6);

  figura1.calcularArea(); 
  figura2.calcularArea();

}