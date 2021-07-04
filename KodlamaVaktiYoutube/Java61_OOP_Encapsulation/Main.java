package KodlamaVaktiYoutube.Java61_OOP_Encapsulation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
         Book b1 = new Book("Harry Potter" , "Rowling" ,"Kodlama Vakti" , 0);
         b1.numberOfPage = -400;
         System.out.println(b1.numberOfPage);
    }
}
