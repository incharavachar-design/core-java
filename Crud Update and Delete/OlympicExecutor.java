class OlympicExecutor
{
public static void main(String []  m)
{
Olympic sport = new Olympic();
boolean added = sport.addSport("Cricket");
System.out.println(added);

added = sport.addSport("Hockey");
System.out.println(added);

added = sport.addSport("Football");
System.out.println(added);

added = sport.addSport("volleyball");
System.out.println(added);

added = sport.addSport("batmiton");
System.out.println(added);

added = sport.addSport("running race");
System.out.println(added);

sport.getSports();
String olympic = sport.getSportByName("Samarth");
	System.out.println(olympic +"is available");
	
	 
	boolean sportUpdated = sport.updatedSport("Keerthan","Jayanth");
	System.out.println(sportUpdated);
	
	sport.getSports();


}
}