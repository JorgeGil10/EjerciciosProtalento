package Aeronaves;

public class Helicoptero extends Voladores implements Aterrizable {
    String model;
    int passengers;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Helicoptero(String pilotName, boolean flyCertification, String model, int passengers) {
        super(pilotName, flyCertification);
        this.model = model;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Modelo de Helicoptero: " + model + " ¿Cuantos pasajeros pueden ingreesar al Helicoptero? " + passengers;
    }

    @Override
    public Approve Landing() {
        System.out.println("El helicoptero puede aterrizar inmediatamente");
        return null;
    }
}
