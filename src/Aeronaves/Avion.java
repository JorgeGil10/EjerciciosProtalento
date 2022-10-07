package Aeronaves;

public class Avion extends Voladores implements Aterrizable {
    int passengers; //cantidad de pasajeros
    String model; //modelo del avión

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Avion(String pilotName, boolean flyCertification, int passengers, String model) {
        super(pilotName, flyCertification);
        this.passengers = passengers;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Modelo Avion: " + model + "La capacidad de ´pasajeros es: " + passengers;

    }

    @Override
    public Approve Landing() {
        System.out.println("Este avion puede aterrizar inmediatamente.");
        return null;
    }

}
