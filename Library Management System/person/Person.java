package person;
import address.Address;

public class Person{
	private String name;
	private String role;
	private Address address;

	public Person(String name, String role, Address address){
		this.name = name;
		this.role = role;
		this.address = address;
}
	public Person(Person other){
		this.name = other.name;
		this.role = other.role;
		this.address = new Address(other.address);
}
	public void showPerson(){
	System.out.println("Name: "+ name +", Role: "+ role);
	address.showAddress();
}

	public String getName(){
		return name; 
}
    	public void setName(String name){
		this.name = name;
}

    	public String getRole(){
		return role;
}
   	public void setRole(String role){
		this.role = role;
}

}