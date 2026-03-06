class ipl
{

static String iplTeams[]={"Royal Challengers Bangalore","Chennai Super Kings","Mumbai Indians","Delhi Capitals","Punjab Kings","Lucknow Super Giants",
"Kolkata Knight Riders","Sunrisers Hyderabad","Gujarat Titans","Rajasthan Royals"};

public static void main(String args[])
{
getIplTeams();
}

static void getIplTeams()
{
System.out.println("The IPL teams are:");
for(String team : iplTeams)
{
System.out.println(team);
}
}

}