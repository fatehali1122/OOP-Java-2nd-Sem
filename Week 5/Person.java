public class Person{
	private String name;
	private String id;

	public Person(String name, String id){
		this.name = name;
		this.id = id;
	}
	public void displayPerson(){
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);

	}
}
