package KodlamaVaktiYoutube.Java61_OOP_Encapsulation;

import java.io.IOException;

public class Book {
    public String name,author,publisher;
    public int numberOfPage;

    public Book(String name, String author, String publisher, int numberOfPage) throws IOException {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        if (numberOfPage<1){
            Throwable e = null;
            e.printStackTrace();
        } else {
            this.numberOfPage = numberOfPage;
        }
    }


}
