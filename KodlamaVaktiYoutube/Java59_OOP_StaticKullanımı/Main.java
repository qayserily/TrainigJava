package KodlamaVaktiYoutube.Java59_OOP_StaticKullanımı;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Öğrenci : " + Student.howStudent());
        Student s1 = new Student("Ali" , 220 , 90);
        Student s2 = new Student("Ayşe" , 330,100);
        Student s3 = new Student("Mehmet" , 440,65);
        System.out.println("Online Öğrenci : " + Student.howStudent());
        s1.exit();
        System.out.println("Online Öğrenci : " + Student.howStudent());

        int[] notlar = new int[3];
        notlar[0]= s1.point;
        notlar[1]= s2.point;
        notlar[2]= s3.point;

        System.out.println("Öğrencilerin not ortalaması : " + Student.calcOverall(notlar));


    }
}
