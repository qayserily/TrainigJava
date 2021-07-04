package KodlamaVaktiYoutube.Java62_OOP_GetterAndSetter;

public class Book {
    public String name , author , publisher ;
    private int numberOfPage;

    public Book(String name, String author, String publisher, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
       if (numberOfPage<1){
           this.numberOfPage= Integer.parseInt(null);
       } else{
           this.numberOfPage = numberOfPage;
       }
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int size) {
        if (size<1){
            System.out.println("Sayfa sayısı negatif olamaz...");
        } else{
            this.numberOfPage = numberOfPage;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
