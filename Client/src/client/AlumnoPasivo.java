package client;


public class AlumnoPasivo extends Alumno {
    public AlumnoPasivo(String string, String string1, int i) {
        super(string, string1, i);
    }
    @Override
    public String toString() {
        // TODO Implement this method
        return super.toString()+"Alumno Pasivo";
    }
}
