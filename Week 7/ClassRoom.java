public class ClassRoom {
    private String className;
    private int classCode;

    Student s1[] = new Student[2];
    Teacher t ;
    ClassRoom(String className, int classCode, Student[] s1, Teacher t){
        this.className = className;
        this.classCode = classCode;
        this.s1 = s1;
        this.t = t;
    }

    public void displayClass(){
        System.out.println("Class name: "+className);
        System.out.println("Class Code: "+classCode);
        for(int i = 0;i<s1.length;i++){
            System.out.println(s1[i].toString());
        }
        System.out.println(t.toString());
    }
}
