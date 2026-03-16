class ArattaiMessenger
{
    static void sendMessage(String friend)
    {
        System.out.println("Sending message to:");
        System.out.println(friend);
    }

    static void sendMessage(String friend, int messages, int unread)
    {
        System.out.println("Friend: " + friend);
        System.out.println("Messages: " + messages);
        System.out.println("Unread: " + unread);
    }
}

