public class Owner extends Person {
    private String ownerID;
    private static int count = 1;

    public Owner(String name) {
        super(name);
        this.ownerID = String.format("%04d", count++);
    }

    public Owner(Owner other) {
        super(other.getName());
        this.ownerID = other.ownerID;
    }

    public String getOwnerID() {
        return ownerID;
    }

    @Override
    public String toString() {
        return String.format("[Name: %s, Owner ID: %s]", getName(), ownerID);
    }
}