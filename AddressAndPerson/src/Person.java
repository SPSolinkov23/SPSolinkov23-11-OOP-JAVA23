public class Person {
    String name;
    int age;
    Address address;

    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void ShowInfo() {
        System.out.println(String.format("Name: " + name));
        System.out.println(String.format("Age: " + age));
        System.out.println(String.format("Address: " + address));
    }
}
