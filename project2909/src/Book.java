class Book {

    String title;
    String author;
    int year;

    // Конструктор
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод showInfo()
    void showInfo(){
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year: " + this.year);
    }


    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);

        Book book2 = new Book("The Hobbit", "J. R. R. Tolkien", 1937);

        book1.showInfo();

        System.out.println();

        book2.showInfo();
    }
}