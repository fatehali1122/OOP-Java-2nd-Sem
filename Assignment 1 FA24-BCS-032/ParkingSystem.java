public class ParkingSystem {
    private String campus;
    private Supervisor supervisor;
    private ParkingZone[] parkingZones;
    private PermitHolder[] permitHolders;
    private static ParkingSystem instance;

    private ParkingSystem(String campus, Supervisor supervisor) {
        this.campus = campus;
        this.supervisor = supervisor;
        this.parkingZones = new ParkingZone[2];
        this.permitHolders = new PermitHolder[2];
    }

    public static ParkingSystem getInstance(String campus, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(campus, supervisor);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    public void addZone(ParkingZone z) {
        for (int i = 0; i < parkingZones.length; i++) {
            if (parkingZones[i] == null) {
                parkingZones[i] = z;
                return;
            }
        }
        System.out.println("Parking Zones are full!");
    }

    public void addPermitHolder(PermitHolder h) {
        for (int i = 0; i < permitHolders.length; i++) {
            if (permitHolders[i] == null) {
                permitHolders[i] = h;
                return;
            }
        }
        System.out.println("PermitHolder list is full!");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Campus: ").append(campus).append("\n");
        sb.append("Supervisor: ").append(supervisor.toString()).append("\n");
        
        sb.append("Zones: [");
        for (int i = 0; i < parkingZones.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(parkingZones[i] != null ? parkingZones[i].toString() : "null");
        }
        sb.append("]\n");
        
        sb.append("Permit Holders: [");
        boolean first = true;
        for (PermitHolder holder : permitHolders) {
            if (holder != null) {
                if (!first) sb.append(", ");
                sb.append(holder.toString());
                first = false;
            }
        }
        sb.append("]");
        
        return sb.toString();
    }
}