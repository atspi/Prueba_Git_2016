package client;


public class Profesor extends Persona {
    private String materia;

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public Profesor() {
        super();
    }

    public Profesor(String string, String string1) {
        super(string, string1);
    }
}
