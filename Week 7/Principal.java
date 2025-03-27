public class Principal extends Person{
    private int experienceYears;

    Principal(String name, int age, int experienceYears){
        super(name,age);
        this.experienceYears = experienceYears;
    }
    @Override
    public String toString(){
        return super.toString()+ String.format("%sExperience Years: \t",experienceYears);
    }
}
