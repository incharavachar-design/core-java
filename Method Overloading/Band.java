class Band
{
    static void createBand(String leader)
    {
        System.out.println("Creating band:");
        System.out.println(leader);
    }

    static void createBand(String leader,int members,String event)
    {
        System.out.println("Leader: " + leader);
        System.out.println("Members: " + members);
        System.out.println("Event: " + event);
    }
}

