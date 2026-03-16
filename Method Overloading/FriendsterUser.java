class FriendsterUser
{
    public static void logIn(String email, String password)
    {
        System.out.println("Friendster login with email");
        System.out.println(email);
        System.out.println(password);
    }

    public static void logIn(long phoneNumber, String password)
    {
        System.out.println("Friendster login with phone number");
        System.out.println(phoneNumber);
        System.out.println(password);
    }
}