import java.util.Scanner;
public class login{
	static String username = "abc@gmail.com";
	static String password = "abc123";

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter User name: ");
		String Username = sc.nextLine();
		System.out.println("Enter Password: ");
		String Password = sa.nextLine();

		if(username.equals(Username) & password.equals(Password)){
		System.out.println("Verified Successfully");
}
		else
		System.out.println("Invalid");
}
}