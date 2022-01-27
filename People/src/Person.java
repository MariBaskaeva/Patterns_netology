import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age = null;
    protected String city = null;

    protected Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAddress(city);
    }

    public boolean hasAge() {
        return age != null;
    }

    public boolean hasAddress() {
        return city != null;
    }

    void setAddress(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return city;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}