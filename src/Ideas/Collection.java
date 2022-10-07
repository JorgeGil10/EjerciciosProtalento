package Ideas;

import java.util.Scanner;

public class Collection {
    Client client = new Client(client.getName(), client.getLastName(), client.getAge(), client.getDocument());
    Client[] clients = new Client[1];
    Scanner keyboard = new Scanner(System.in);

    /**
     * En este punto me sirvió de referencia @Fredymj07
     */
    public void captureClientData() {
        System.out.println("Por favor ingrese los datos de la cliente: ");
        String input = keyboard.nextLine();
        String[] data = input.split("&");
        client.setName(data[0]);
        client.setLastName(data[1]);
        client.setAge(data[2]);
    }
    public int sizeArray() {
        return clients.length;
    }
    public void getClients() {
        try {
            for (int i = 0; i < clients.length; i++) {
                System.out.println((i + 1) + " -> " + clients[i].toString());
            }
        } catch (Exception e) {
            System.out.println("The list of clients is empty.");
        }
    }
    public Client[] increaseSize(Client[] clients) {
        Client[] clientsAuxiliar = new Client[clients.length + 1];
        clientsAuxiliar[clientsAuxiliar.length - 1] = client;
        for (int i = 0; i < clients.length; i++) {
            clientsAuxiliar[i] = clients[i];
        }
        return clientsAuxiliar;
    }

    public void addObject() {
        captureClientData();
        client = new Client(client.getName(), client.getLastName(), client.getAge(), client.getDocument());
        if (clients[0] == null) {
            clients[0] = client;
        } else {
            clients = increaseSize(clients);
        }
    }
    public boolean isEmpty() {
        return clients.length == 0;
    }
    public void exit() {
        keyboard.close();
        System.exit(0);
    }
}
