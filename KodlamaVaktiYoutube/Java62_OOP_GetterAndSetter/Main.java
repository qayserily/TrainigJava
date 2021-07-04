package KodlamaVaktiYoutube.Java62_OOP_GetterAndSetter;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Bayram","Murat" , "qayserily" , 400);

        System.out.println(book1.getNumberOfPage());
        System.out.println("***************************************************************************************");
        book1.setNumberOfPage(200);
        System.out.println(book1.getNumberOfPage());
    }
}
