class WorldCup
{

static String GroupA[]={"India","Pakistan","Netherlands","Namibia","USA"};

static String GroupB[]={"Sri Lanka","Australia","Zimbabwe","Ireland","Oman"};

static String GroupC[]={"West Indies","England","Scotland","Italy","Nepal"};

static String GroupD[]={"South Africa","New Zealand","Afghanistan","UAE","Canada"};


public static void main(String args[])
{
getGroupA();
getGroupB();
getGroupC();
getGroupD();
}

static void getGroupA()
{
System.out.println("The T20 WorldCup Group A teams are:");
for(String team : GroupA)
{
System.out.println(team);
}
}

static void getGroupB()
{
System.out.println("The T20 WorldCup Group B teams are:");
for(String team : GroupB)
{
System.out.println(team);
}
}

static void getGroupC()
{
System.out.println("The T20 WorldCup Group C teams are:");
for(String team : GroupC)
{
System.out.println(team);
}
}

static void getGroupD()
{
System.out.println("The T20 WorldCup Group D teams are:");
for(String team : GroupD)
{
System.out.println(team);
}
}

}