
public class LoginAppAddLogical {

	public static void main(String[] args) {
		
		String input_id = args[0];
		String input_password = args[1];
		String id = "egoing";
		String password = "111111";
		
		if(id.equals(input_id) && password.equals(input_password)) {
			System.out.println("Welcome Master!");
		} else {
			System.out.println("wrong");
		}
		
	}

}
