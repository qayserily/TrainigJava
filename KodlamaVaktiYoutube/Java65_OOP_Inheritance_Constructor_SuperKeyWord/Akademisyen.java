package KodlamaVaktiYoutube.Java65_OOP_Inheritance_Constructor_SuperKeyWord;

public class Akademisyen extends Calisan{
    String bolum , gorevler ;
    String[] dersler ;

    public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String[] dersler) {
        super(adSoyad, eposta, telefon);
        this.bolum = bolum;
        this.gorevler = gorevler;
        this.dersler = dersler;
    }

    public void derseGir(){
        System.out.println("Derse girildi...");
    }
}
