package Aeronaves;

public abstract class Voladores {
    protected String pilotName;
    boolean flyCertification = true; //permiso de vuelo

    public Voladores(String pilotName, boolean flyCertification) {
        this.pilotName = pilotName;
        this.flyCertification = flyCertification;
    }

    public String getName() {
        return pilotName;
    }

    public void setName(String name) {
        this.pilotName = name;
    }


    public boolean isFlyCertification() {
        if (flyCertification == true){
            System.out.println("La tiene licencia de vuelo");
        }else {
            System.out.println("la nave no tiene licencia y no puede aterrizar");
        }
        return flyCertification;
    }

    public void setFlyCertification(boolean flyCertification) {
        this.flyCertification = flyCertification;
    }

    @Override
    public String toString() {
        return "El nombre del piloto es " + pilotName + " ¿Tiene permiso de vuelo?  " + flyCertification;
    }
}
