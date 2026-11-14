package Taller15.Ejercicio3;

public class ValidacionUsuarioService {

    public boolean validarUsuario(Usuario usuario) {
        if (usuario == null) {
            return false;
        }
        boolean nombreValido = usuario.getNombre() != null && !usuario.getNombre().isEmpty();
        boolean correoValido = usuario.getCorreo() != null && usuario.getCorreo().contains("@");
        boolean contrasenaValida = usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;

        return nombreValido && correoValido && contrasenaValida;
    }

}
