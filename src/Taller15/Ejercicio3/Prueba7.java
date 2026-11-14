import Taller15.Ejercicio3.AutenticacionService;
import Taller15.Ejercicio3.Usuario;
import Taller15.Ejercicio3.ValidacionUsuarioService;

void main() {

    Usuario usuario = new Usuario("Devian Arrieta", "devian@mail.com", "contraseña");

    ValidacionUsuarioService validacionService = new ValidacionUsuarioService();
    AutenticacionService autenticacionService = new AutenticacionService();

    if (validacionService.validarUsuario(usuario)) {
        System.out.println("Datos del usuario válidos");

        boolean acceso = autenticacionService.autenticar(usuario, "devian@mail.com", "contraseña");
        if (acceso) {
            System.out.println("Autenticación exitosa. Bienvenido, " + usuario.getNombre());
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    } else {
        System.out.println("Los datos del usuario no son válidos.");
    }

}
