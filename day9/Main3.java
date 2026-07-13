package day9;

class Book {

    String title;
    String author;

    void show() {

        System.out.println(title);
        System.out.println(author);
    }
}

public class Main3 {

    public static void main(String[] args) {

        Book b = new Book();

        b.title = "Java";
        b.author = "James Gosling";

        b.show();
    }
}