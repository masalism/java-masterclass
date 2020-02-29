package mantas.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("Masalis");
        person.setAge(34);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
    }
}
