import Aeronaves.*;

import static UI.UIController.*;

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion("Sheldon Cooper",true,190, "Airbus001");
        Helicoptero h = new Helicoptero("Silvestre Stallon",false, "Hawk123", 4);
        Superman s = new Superman("Clark Kent", true, false, false);
        Ovni o = new Ovni("Marcianito",false, "circulo");

        Voladores[] voladors = new Voladores[] {a,h,s,o};

        for(Voladores v: voladors) {

            if(v instanceof Aterrizable) {

                Aterrizable atr = (Aterrizable)v;

                Approve approve = atr.Landing();

            }else {
                System.out.println("No se le autoriza a aterrizar. Llamar a las fuerzas aereas");
            }

        }
      //showMenu();
    }
}