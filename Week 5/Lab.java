public class Lab{
	private String labName;
	private Person labIncharge;
	private int noOfPc;
	PC[] pc;

	public Lab(String labName, Person labIncharge, int noOfPC) {
       		this.labName = labName;
        	this.labIncharge = labIncharge;
        	this.pc = new PC[noOfPC];
}

    	public void addPC(PC newPC, int index) {
        	if (index >= 0 && index < pc.length) {
            		pc[index] = newPC;
        }
    }

    public void displayLab() {
        System.out.println("\nLab Name: " + labName);
        System.out.println("Lab Incharge: " + labIncharge);
        for (int i = 0; i < pc.length; i++) {
            if (pc[i] != null) {
                pc[i].displayPC();
            }
}
}
}