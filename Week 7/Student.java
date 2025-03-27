public class Student extends Person{
    private int rollNumber;

    Student(String name, int age, int rollNumber){
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString(){
        return super.toString()+ String.format("%dRoll Number: \t", rollNumber);

    }
    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(other == null || getClass() != other.getClass()){
            return false;
        }
        Student otherStudent = (Student) other;
        return this.rollNumber == otherStudent.rollNumber;
    }
}
