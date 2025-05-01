public class Vehicle {
    private String plate;
    private String type;
    private Owner owner;

    public Vehicle(String plate, String type, Owner owner) {
        this.plate = plate;
        this.type = type;
        this.owner = owner;
    }

    // Shallow copy constructor
    public Vehicle(Vehicle other) {
        this.plate = other.plate;
        this.type = other.type;
        this.owner = other.owner;
    }

    // Deep copy method
    public Vehicle deepCopy() {
        Owner newOwner = new Owner(this.owner);
        return new Vehicle(this.plate, this.type, newOwner);
    }

    public String getPlate() {
        return plate;
    }

    public String getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return plate.equals(vehicle.plate);
    }

    @Override
    public String toString() {
        return String.format("License Plate: %s, Type: %s, Owner: %s", 
               plate, type, owner.toString());
    }
}