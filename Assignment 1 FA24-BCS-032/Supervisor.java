public class Supervisor extends Person {
    private int yearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Experience: %d years", getName(), yearsOfExperience);
    }
}