public class PermitHolder extends Person{
	private int permitID;
		static int count = 1;

	public PermitHolder(String name){
		super(name);
		this.permitID = setPermit();
	}
	
	public int setPermit(){
		permitID = count;
		count++;
		return permitID;
	}
	
	@Override
	public String toString(){
		return String.format("Permit Id: %d\n",permitID)+"Permit Holder "+super.toString();
	}
}