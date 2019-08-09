// esta clase es la que va a simular los campos de nuestra tabla de la base de datos
package personas.dto;
// autor Gustavo culma 
public class PersonasDTO {
private int id_persona;
private String nombre;
private String apellido;   

    public PersonasDTO(int id_persona, String nombre, String apellido) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public PersonasDTO() {
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
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

    @Override
    public String toString() {
        return "PersonasDTO{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    

}
