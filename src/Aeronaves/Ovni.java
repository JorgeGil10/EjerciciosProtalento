package Aeronaves;

public class Ovni extends Voladores implements Aterrizable{
    String form;

    public Ovni(String pilotName, boolean flyCertification, String form) {
        super(pilotName, flyCertification);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "¿Qué forma tiene el OVNI? " + form;
    }

    @Override
    public Approve Landing() {
        System.out.println("El ovni puede aterrizar");
        return null;
    }
}
