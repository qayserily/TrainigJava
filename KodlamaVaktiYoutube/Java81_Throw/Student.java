package KodlamaVaktiYoutube.Java81_Throw;

public class Student {

    public static Student find(String id) throws studentException {
        if (id.equals("123")){
            return new Student();
        }else{
            throw new studentException("Öğrenci bulunamadı");
        }
    }
}
