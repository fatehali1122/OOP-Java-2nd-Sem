package address;
public class Address{

	String street;
	String city;
	Address(String street, String city){
		this.street = street;
		this.city = city;
}
	Address(Address other){
		this.street = other.street;
		this.city = other.city;
}

	public void showAddress(){
		System.out.println("Street: "+ street + ", City: "+ city);
}
	
	public String getStreet() {
		 return street;
 }
    	public void setStreet(String street) {
		 this.street = street;
 }
	public String getCity(){
		return city;
}
	public void setCity(String city){
		this.city = city;
}
}