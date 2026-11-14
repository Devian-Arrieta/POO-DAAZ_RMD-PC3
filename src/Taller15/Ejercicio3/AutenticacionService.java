package Taller15.Ejercicio3;

public class AutenticacionService {

    public boolean autenticar(Usuario usuario, String correoIngresado, String contrasenaIngresada) {
        if (usuario == null) {
            return false;
        }
        return usuario.getCorreo().equals(correoIngresado)
                && usuario.getContrasena().equals(contrasenaIngresada);
    }

}
