package main;
import users.UserManager;
import util.PasswordValidator;
import java.util.Scanner;
import java.io.Console;
public class LoginSystem{
	public static void main(String args[]){
		Console console = System.console();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User name: ");
		String user_name = sc.next();

		System.out.println("Enter Password: ");
		char[] pass = console.readPassword();
		
	
		UserManager.LoginProcessor.authenticate(user_name, pass);  
		
		
	} 
}