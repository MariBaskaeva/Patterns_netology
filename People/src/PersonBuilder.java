public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age = null;
    private String city = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname);
        person.age = age;
        person.setAddress(city);
        if (name == null || surname == null) {
            throw new IllegalStateException("Имя и фамилия обязательны для ввода.");
        }
        if (person.hasAge() && person.age < 1)
            throw new IllegalArgumentException("Возраст не может быть меньше 1.");
        return person;
    }
}