class SouthIndia
{
    String airportNames[] = new String[9];
    int index;

    public boolean addAirportNames(String airport) {
    boolean isAirportAdded = false;

    if (index < airportNames.length) {
    if (airport != null && !airport.isEmpty()) {
    airportNames[index++] = airport;
    isAirportAdded = true;
    } 
	else
    System.out.println(airport + " is not valid");
	}
	else System.out.println("this airport not avaliable");
    return isAirportAdded;
        
    }

    public void getAirport() {
        System.out.println("The avilable airport  are:");
        for (String airport : airportNames)
            System.out.println(airport);
    }
}