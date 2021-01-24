package jsBasic;

public class javaTest {

	public static void main(String[] args) {

		User user = new User();
		String name = user.getName();
		String email = user.getEmail();
		System.out.println("name : "+ name);
		System.out.println("email : "+ email);
	}

}
