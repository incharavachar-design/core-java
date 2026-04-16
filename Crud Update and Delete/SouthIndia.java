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
	
	public String getAirportByName(String airportName)
	{
		String name = null;
		for(String  airport :airportNames)
		{
			if(airport == airportName)
			{
				name = airport;
				
				
			}
		}
		if(name == null)
			System.out.println(airportName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedAirport(String existingAirportName, String updatedAirportName)
	{
	boolean isAirportUpdated = false;

	for(int index = 0; index < airportNames.length;index++)
	{
		if(airportNames[index] == existingAirportName)
		{
			airportNames[index] = updatedAirportName;
			isAirportUpdated  = true;
		}
	}
		if(isAirportUpdated == false)
		{
			System.out.println(existingAirportName+"not found");
			
		}
			return isAirportUpdated;
			
	}
}


