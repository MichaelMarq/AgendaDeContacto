
package vista;


public class Persona {
    
    //Atributos
    
    private String nombre,correo,telefono;
    
    //Constructor

    public Persona(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    //Metodos get

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

  
    
    
    
}
