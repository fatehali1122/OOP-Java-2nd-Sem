public class Person_attr{

	public static void main(String args[]){

		Person p1 = new Person("Fateh","Ali","abc@gmail.com","LDA Avenue",18,"Fa24-BCS-032","CS","M","CUI","A");
		Person p2 = new Person("Fateh","FA24-BCS-032","A");
		Person p3 = new Person("CS","CUI");
		Person p4 = new Person(18,"Ali");
		
		printData(p1);

	}
	public static void printData(Person p){
		System.out.printf("Name:%15s\n",p.name);
		System.out.printf("Father:%12s\n",p.father_name);
		System.out.printf("Email:%13s\t\n",p.email);
		System.out.printf("Address:%11s\t\n",p.address);
		System.out.printf("Age:%15d\n",p.age);
		System.out.printf("Reg No:%12s\t\n",p.reg_no);
		System.out.printf("Department:%8s\n",p.dep);
		System.out.printf("Gender:%12s\n",p.gender);
		System.out.printf("Institute:%9s\n",p.institute);
		System.out.printf("Grade:%13s\n",p.grade);

}
}