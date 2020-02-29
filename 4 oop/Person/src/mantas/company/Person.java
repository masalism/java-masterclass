package mantas.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        if (this.age <= 0 || this.age > 100) {
            return 0;
        }
        return this.age;
    }

    public boolean isTeen() {
        if (this.age < 20 && this.age > 12) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName () {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
