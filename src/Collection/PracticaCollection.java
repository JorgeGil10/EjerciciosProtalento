package Collection;

import Ideas.Collection;

import java.util.Scanner;

public class PracticaCollection{
    


import java.util.Scanner;

    public class Test {

        Collection customArray = new Collection();
        static Scanner keyboard = new Scanner(System.in);

        public void runOption(int option) {
            switch (option) {
                case 1:
                    customArray.addObject();
                    System.out.println("Se agregó correctamente");
                    break;
                case 2:
                    if (customArray.isEmpty()) {
                        System.out.println("Is empty\n");
                    } else {
                        System.out.println("ok\n");
                    }
                    break;
                case 3:
                    System.out.println("Tamaño del arreglo " + customArray.sizeArray());
                    break;
                case 4:
                    System.out.println("Clientes");
                    customArray.getClients();
                    break;
                default:
                    if(option > 4) {
                        System.out.println("Salir");
                        customArray.exit();
                    }
                    break;
            }
        }

        public void showMenu() {
            String menu = "\n1. Cliente";
            menu += "\n2. Todos los clientes";
            menu += "\n0. Salir";
            System.out.println(menu);
            System.out.println("Seleccione una opción ");
            int option = Integer.parseInt(keyboard.next());
            runOption(option);
            showMenu();
        }

        public static void main(String[] args) {
            Test test = new Test();
            test.showMenu();
            keyboard.close();
        }
    }
}
