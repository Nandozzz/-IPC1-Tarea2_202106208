
package tarea2;

public class Usuario {
    
    
    String carnet;
    String nombre,apellido;
    
    
    Usuario(String carnet, String nombre, String apellido){
     this.carnet=carnet;
     this.nombre=nombre;
     this.apellido=apellido;
             
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
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
    
    
    

    
    
    
}
