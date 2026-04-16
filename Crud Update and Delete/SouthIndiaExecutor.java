class SouthIndiaExecutor
{
public static void main(String []  s)
{
SouthIndia airport = new SouthIndia();
boolean added = airport.addAirportNames("Kempegowda International Airport");
System.out.println(added);

added = airport.addAirportNames("Chennai International Airport");
System.out.println(added);

added = airport.addAirportNames("Cochin International Airport");
System.out.println(added);

added = airport.addAirportNames("Visakhapatnam Airport");
System.out.println(added);

added = airport.addAirportNames("Begumpet Airport");
System.out.println(added);

added = airport.addAirportNames("Kuvempu Airport");
System.out.println(added);

added = airport.addAirportNames("Mysore Airport");
System.out.println(added);

added = airport.addAirportNames("Belagavi Airport");
System.out.println(added);

added = airport.addAirportNames("Mangalore International Airport");
System.out.println(added);

airport.getAirport();

String port = airport.getAirportByName("Mysore Airport");
	System.out.println(port + " is available ");
	
	boolean airportUpdated = airport.updatedAirport("Kuvempu Airport","New Kuvempu Airport");
	System.out.println(airportUpdated);
	
	airport.getAirport();
}
}