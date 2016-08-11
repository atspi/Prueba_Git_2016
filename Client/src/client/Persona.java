package client;


public class Persona {
    private String nombre;
    private String DNI;

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Persona() {

        super();
    }
}
