package ru.netology;

public class PersonBuilder implements IPersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        }
        Person person;
        if (age != 0) {
            person = new Person(name, surname, age);

        } else {
            person = new Person(name, surname);
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
