package KodlamaVaktiYoutube.Java81_Throw;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            Student s1 = Student.find("12");
        } catch (studentException e) {
            e.printStackTrace();
        }
    }
}
