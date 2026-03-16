class Blind
{
    static void postReview(String user)
    {
        System.out.println("Posting company review:");
        System.out.println(user);
    }

    static void postReview(String user,String company,int likes)
    {
        System.out.println("User: " + user);
        System.out.println("Company: " + company);
        System.out.println("Likes: " + likes);
    }
}

