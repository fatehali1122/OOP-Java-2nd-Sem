public class ParkingZone{
	private int zoneID;
	private Vehicle[] vehicle;
		static int count = 11;

	public ParkingZone(){
		this.zoneID = setZoneID();
		this.vehicle = new Vehicle[3];
	}
	
	public int setZoneID(){
		zoneID = count;
		count++;
		return zoneID;
	}
	public void addVehicle(Vehicle v){
		for(int i = 0;i<vehicle.length;i++){
			//if(vehicle[i] == null){
				vehicle[i] = v;
				//break;
			//}
		}
		
		//System.out.println("Vehicle list is full!");
	}

	@Override
	public String toString(){
		StringBuilder vehicleString = new StringBuilder();

		for(Vehicle v: vehicle){
			vehicleString.append(v.toString());
		}
		return String.format("Zone ID: %d\n",zoneID)+ vehicleString;
	}
}