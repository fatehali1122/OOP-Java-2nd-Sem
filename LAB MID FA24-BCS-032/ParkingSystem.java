public class ParkingSystem{
	private String campus;
	private Supervisor supervisor;

	private ParkingZone[] parkingZone;

	private PermitHolder[] permitHolder;

	public ParkingSystem(String campus, Supervisor supervisor){
		this.campus = campus;
		this.supervisor = supervisor;
		this.parkingZone = new ParkingZone[2];
		this.permitHolder = new PermitHolder[2];
	}

	public void addZone(ParkingZone z){
		for(int i = 0;i<parkingZone.length;i++){
			if(parkingZone[i] == null){
				parkingZone[i] = z;
				return;
			}
		}
		
		System.out.println("Parking Zones are full!");
	}

	public void addPermitH(PermitHolder h){
		for(int i = 0;i<permitHolder.length;i++){
			if(permitHolder[i] == null){
				permitHolder[i] = h;
				return;
			}
		}
		
		System.out.println("PermitHolder list is full!");
	}
	@Override
	public String toString(){
		return String.format("Campus: %s",campus)+ supervisor.toString() +"\n"+ parkingZone[0].toString()+"\n"+parkingZone[1].toString()+"\n"+permitHolder[0].toString()+permitHolder[1].toString();
	}		


}