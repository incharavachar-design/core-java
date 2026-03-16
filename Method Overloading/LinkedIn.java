class LinkedIn
{
    public static void connect(String name)
    {
        System.out.println("Connection request sent to " + name);
    }

    public static void connect(String name, String message)
    {
        System.out.println("Connection request sent to " + name);
        System.out.println("Message: " + message);
    }
}