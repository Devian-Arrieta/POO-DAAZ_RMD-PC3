package Taller15.Ejercicio3;

public class Usuario {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    /*

    // Sin SRP

    public boolean validarDatos() {
        return nombre != null && !nombre.isEmpty()
                && correo != null && correo.contains("@")
                && contrasena != null && contrasena.length() >= 6;
    }

    public boolean autenticar(String correoIngresado, String contrasenaIngresada) {
        return this.correo.equals(correoIngresado) && this.contrasena.equals(contrasenaIngresada);
    }

     */
}
