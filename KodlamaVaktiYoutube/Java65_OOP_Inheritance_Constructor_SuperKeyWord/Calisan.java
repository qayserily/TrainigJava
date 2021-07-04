package KodlamaVaktiYoutube.Java65_OOP_Inheritance_Constructor_SuperKeyWord;

public class Calisan {
    private String adSoyad, eposta , telefon;
    static int giris_sayisi;

    public Calisan(String adSoyad, String eposta, String telefon) {
        this.adSoyad = adSoyad;
        this.eposta = eposta;
        this.telefon = telefon;
    }

    public static int giris(){
        return ++Calisan.giris_sayisi;

    }


}
