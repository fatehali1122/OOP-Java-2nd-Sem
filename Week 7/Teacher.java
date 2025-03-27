public class Teacher extends Person{
    private int teacherId;
    private String subject;

    Teacher(String name, int age,int teacherId, String subject){
        super(name, age);
        this.teacherId = teacherId;
        this.subject = subject;
    }
    @Override
    public String toString(){
        return super.toString()+ String.format("%d Teacher Id: \t%sSubject: \t", teacherId,subject);
    }

    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null || getClass() != other.getClass()){
            return false;

        }
        Teacher otherTeacher = (Teacher) other;
        return this.teacherId == otherTeacher.teacherId;
    }
}
