package guia_02;


/****************************************************************
 *
 * 1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
 *    precio, stock y Autor, este último posee las características de nombre, apellido,
 *    email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
 *    único autor. Ejecute las siguientes instrucciones:
 *    a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
 *    b. Imprima por pantalla al autor previamente instanciado.
 *    c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
 *    pesos con una cantidad de 150 copias.
 *    d. Imprima por pantalla el libro instanciado.
 *    e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
 *    cantidad en 50 copias.
 *    f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
 *    Libro “Effective Java”.
 *    g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
 *    siguiente mensaje:
 *    “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
 *     h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
 *     cambios necesarios en el método del punto g, para imprimir un nuevo
 *     mensaje que liste los autores que contribuyeron a ese libro.
 *
 ***************************************************************/


public class Libro {

    //Atributos
    private String titulo = "Effective Java";
    private double precio = 450;
    private int stock = 150;
    private String nombre = "Joshua";
    private String apellido = "Bloch";
    private String email = "joshua@email.com";
    private char genero = 'M';

    //Constructor
    public Libro() {

    }

    public Libro(String titulo, double precio, int stock, String nombre, String apellido, String email, char genero) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    //Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
    public String imprimeAutor() {
        return "Nombre:" + this.nombre + " | " + " Apellido:" + this.apellido + " | " + " Email:" + this.email + " | " + " Genero:" + this.genero;
    }
   /*
   e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
   *  cantidad en 50 copias.
   */
    public String cambioTitulo(String nombreLibro){
        return this.titulo = nombreLibro;
    }
    /*
     *  f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
     *  Libro “Effective Java”.
     */
    public String buscaAutoreImprime(String buscaAutor){
        if(this.nombre == buscaAutor){
            return "Lirbo:" + this.titulo + " | " + " Precio:" + this.precio + " | " + " Stock:" + this.stock ;
        }else{
            System.out.println("Autor no encontrado...");
        }

    }
    /* Metodo que se habia creado para llamar en el metodo de Busca autor e Imprime, se decidio mostrar todo en un mismo metodo

    public String imprimeLibro() {
        return "Lirbo:" + this.titulo + " | " + " Precio:" + this.precio + " | " + " Stock:" + this.stock ;
    }

     */



}
