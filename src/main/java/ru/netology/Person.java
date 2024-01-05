package ru.netology;

public class Person {
    protected final String NAME;
    protected final String SURNAME;
    protected int age;
    protected String address;

    public Person(String NAME, String SURNAME, int age) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
        this.age = age;
    }

    public Person(String NAME, String SURNAME) {
        this.NAME = NAME;
        this.SURNAME = SURNAME;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNAME() {
        return NAME;
    }

    public String getSURNAME() {
        return SURNAME;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean hasAge() { /*...*/
        return false;
    }

    public boolean hasAddress() {
        return !this.address.isEmpty();
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        } else {
            System.out.println("Возраст не может быть изменён, т.к. возраст не известен");
        }
    }


    @Override
    public String toString() {
        return (this.SURNAME + " " + this.NAME);
    }

    @Override
    public int hashCode() {
        return SURNAME.hashCode() + NAME.hashCode() + address.hashCode() + age;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(this.SURNAME);
        child.setAddress(this.address);
        return child;
    }
}
