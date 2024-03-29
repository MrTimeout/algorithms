import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book{
    private int price;
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d", this.title, this.author, this.price);
    }
}

public class Solution {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
