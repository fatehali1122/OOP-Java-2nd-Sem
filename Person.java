public class Person{
	String name;
	String father_name;
	String email;
	String address;
	int age;
	String reg_no;
	String dep;
	String gender;
	String institute;
	String grade;

	Person(String name,String father_name,String email,String address,int age,String reg_no,String dep,String gender,String institute,String grade){
		this.name = name;
		this.father_name = father_name;
		this.email = email;
		this.address = address;
		this.age = age;
		this.reg_no = reg_no;
		this.dep = dep;
		this.gender = gender;
		this.institute = institute;
		this.grade = grade;

}

	Person(String name, String reg_no, String grade){
		this.name = name;
		this.reg_no = reg_no;
		this.grade = grade;
}

	Person(String dep, String institute){
		this.dep = dep;

		this.institute = institute;
}
	Person(int age, String father_name){
		this.age = age;
		this.father_name = father_name;
}
}