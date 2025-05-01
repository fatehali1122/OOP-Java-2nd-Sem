public class PermitHolder extends Person {
    private int permitID;
    private static int count = 1000;

    public PermitHolder(String name) {
        super(name);
        this.permitID = count++;
    }

    public int getPermitID() {
        return permitID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Permit ID: %d", getName(), permitID);
    }
}