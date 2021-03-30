package guia_02;

public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor() {

    }

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    /*
    b. Imprima por pantalla al autor previamente instanciado.
     */
    public String toString() {
        return  "\nAutor: " +
                "\nNombre:...... " + this.nombre +
                "\nApellido:.... " + this.apellido +
                "\nEmail:....... " + this.email +
                "\nGenero:...... " + this.genero;
    }
}
