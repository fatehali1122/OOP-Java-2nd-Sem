public class SMS {
    public static void main(String args[]){
        Principal principal = new Principal("ali",30,12);
        School school = new School("CUI","LDA AVE",principal);

        Teacher teacher = new Teacher("Shahid Bhatti",40,12 , OOP);

        ClassRoom c1 = new ClassRoom("CS", 90, new Student[{new Student("ali", 16, 10),new Student("Ahmad", 18, 2)}], teacher);
    }
}
