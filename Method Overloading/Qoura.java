class Qoura
{
	static void logIn(String email)
	{
			System.out.println("accepted  email");
			System.out.println(email);
	}
	static void logIn(String email,long phoneNumber,String password)
	{
		System.out.println("accepted phoneNumber and password");
		System.out.println(email);
		System.out.println(phoneNumber);
		System.out.println(password);
	}
}