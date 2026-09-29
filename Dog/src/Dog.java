class Dog {

    String name;
    int age;

    // Конструктор
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Метод bark()
    void bark(name){
        System.out.println(name + "says: Whofff")
    }



    // Метод showInfo()
    void showInfo(name, age){
        System.out.println("The dog's name is " + name + "and the age is " + age);
    }


    public static void main(String[] args) {

        Dog dog1 = new Dog(
                "Rex",
                4
        );

        dog1.showInfo();
        dog1.bark();
    }
}