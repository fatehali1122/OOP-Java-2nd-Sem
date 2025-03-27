import java.util.ArrayList;
public class School {
    private String name;
    private String address;

    Principal p ;
    private ArrayList<ClassRoom> classroom;

    School(String name, String address, Principal p){
        this.name = name;
        this.address = address;
        this.p = p;
        this.classroom = new ArrayList<>();
    }

    public void displaySchool(){
        System.out.println("School Name: "+name);
        System.out.println("Address: "+address);
        p.toString();

    }
    public void addClass(ClassRoom classrooms){
        classroom.add(classrooms);
    }
}
