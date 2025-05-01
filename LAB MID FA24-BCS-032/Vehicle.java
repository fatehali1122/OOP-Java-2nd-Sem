public class Vehicle{
	private String plate;
	private String type;
	private Owner owner;

	public Vehicle(String plate,String type,Owner owner){
		this.plate = plate;	
		this.type = type;
		this.owner = owner;
	}
	
	public Vehicle(Vehicle other){
		this.plate = other.plate;
		this.type = other.type;
		this.owner = other.owner;

	}
	@Override
	public String toString(){
		return String.format("License: %s\nType: %s\n",plate,type)  + owner.toString();
	}	
}