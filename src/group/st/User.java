package group.st;

public class User {
    String name;
    String surname;
    String secondName;
    String status;
    String shortName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setShortName() {
        this.shortName = getSurname() + " " + getName().charAt(0) + ". " + getSecondName().charAt(0) + ".";

    }

    public void Printed() {

    }
}
