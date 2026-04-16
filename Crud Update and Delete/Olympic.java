class Olympic {
    String sportNames[] = new String[11];
    int index;

    public boolean addSport(String sport) {
    boolean isSportAdded = false;

    if (index < sportNames.length) {
    if (sport != null && !sport.isEmpty()) {
    sportNames[index++] = sport;
    isSportAdded = true;
    } 
	else
    System.out.println(sport + " is not valid");
	}
	else System.out.println("this sport is not avaliable");
    return isSportAdded;
        
    }

    public void getSports() {
        System.out.println("The avilable Sports  are:");
        for (String sport : sportNames)
            System.out.println(sport);
    }
public String getSportByName(String sportName)
	{
		String name = null;
		for(String  sport :sportNames)
		{
			if(sport == sportNames)
			{
				name = sport;
				
				
			}
		}
		if(name == null)
			System.out.println(sportName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedSport(String existingSportName, String updatedSportName)
	{
	boolean isSportUpdated = false;

	for(int index = 0; index < sportNames.length;index++)
	{
		if(sportNames[index] == existingSportNameName)
		{
			sportNames[index] = updatedSportName;
			isSportUpdated  = true;
		}
	}
		if(isSportUpdated == false)
		{
			System.out.println(existingSportName+"not found");
			
		}
			return isSportUpdated;
			
	}
}


