import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class ObjectReadWriteExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Write object to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
        oos.writeObject(new Person("John Doe", 30));
        oos.close();

        // Read object from file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
        Person person = (Person) ois.readObject();
        ois.close();

        System.out.println("Read Object: " + person);
    }
}
