class Cars {
        String brand;
        String color;
        int year;

    void Car(String brand, String color, int year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void showInfo(String brand, String color, int year){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    void drive(String brand) {
        System.out.println(brand + " is driving!");
    }

    public static void main(String[] args){
        Cars car1 = new Cars("Toyota", "Red", 2009);
        Cars car2 = new Cars("BWM", "Blue", 2025);
    }
}
