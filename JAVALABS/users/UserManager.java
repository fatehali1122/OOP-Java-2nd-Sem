package users;
import util.PasswordValidator;

public class UserManager{
	static final String storedUsername = "abc@gmail.com";
	static final String storedPassword = "12345";
	
	static PasswordValidator p = new PasswordValidator(); 
	public static class LoginProcessor{
		public static void authenticate(String username, char[] password){
			if (storedUsername.equals(username) && storedPassword.equals(p.isValid(password)))
				System.out.println("Access Granted!");
			else
				System.out.println("Access Denied!");
}
}
}