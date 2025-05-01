public class ParkingZone {
    private String zoneID;
    private Vehicle[] vehicles;
    private static int count = 1;

    public ParkingZone() {
        this.zoneID = "Z" + count++;
        this.vehicles = new Vehicle[5];
    }

    public String getZoneID() {
        return zoneID;
    }

    public void addVehicle(Vehicle v) {
        if (v == null) return;
        
        for (Vehicle existing : vehicles) {
            if (existing != null && existing.equals(v)) {
                System.out.println("Error: Duplicate license plate '" + v.getPlate() + "' is not allowed.");
                return;
            }
        }
 
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = v;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zone ID: ").append(zoneID).append(", Vehicles: [");
        
        for (int i = 0; i < vehicles.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(vehicles[i] != null ? vehicles[i].toString() : "null");
        }
        sb.append("]");
        return sb.toString();
    }
}