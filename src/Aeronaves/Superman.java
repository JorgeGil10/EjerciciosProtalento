package Aeronaves;

public class Superman extends Voladores implements Aterrizable {
    boolean isABird = false;
    boolean isAAirplane = false;


    public Superman(String pilotName, boolean flyCertification, boolean isABird, boolean isAAirplane) {
        super(pilotName, flyCertification);
        this.isABird = isABird;
        this.isAAirplane = isAAirplane;
    }

    public boolean isABird() {
        return isABird;
    }

    public void setABird(boolean ABird) {
        isABird = ABird;
    }

    public boolean isAAirplane() {
        return isAAirplane;
    }

    public void setAAirplane(boolean AAirplane) {
        isAAirplane = AAirplane;
    }

    @Override
    public String toString() {
        return "¿Es un ave? " + isABird + " ¿Es un avión? " + isAAirplane + " ¡Es Superman!" ;
    }

    @Override
    public Approve Landing() {
        System.out.println("El hombre de acero puede aterrizar");
        return null;
    }
}
