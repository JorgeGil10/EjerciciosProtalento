package Ideas;

public class Client {
    private String name;
    private String lastName;
    private String age;

    private String document;

    public Client(String name, String lastName, String age, String document) {
    }

    public Client(String name, String lastName, String age, String typeDocument, String numberDocument) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.document = numberDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "El nombre de La Cliente es:  " + name + " El apellido de la cliente es: " + lastName + " la edad de la cliente es: " + age +  " El numero de identificación es:  " + document;
    }

}
