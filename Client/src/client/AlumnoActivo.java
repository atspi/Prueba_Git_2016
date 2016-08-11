package client;


public class AlumnoActivo extends Alumno {

    @Override
    public String toString() {
        // TODO Implement this method
        return super.toString()+"Alumno Activo";
    }

    public AlumnoActivo(String string, String string1, int i) {
        super(string, string1, i);
    }
}
