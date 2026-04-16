class Movie
{
String castsNames [] = new String[9];
int index;

    public boolean addCast(String cast) {
    boolean isCastAdded = false;

    if (index < castsNames.length) {
    if (cast != null && !cast.isEmpty()) {
    castsNames[index++] = cast;
    isCastAdded = true;
    } 
	else
    System.out.println(cast + " is not valid");
	}
	else System.out.println("this cast is not avaliable");
    return isCastAdded;
        
    }

    public void getCasts() {
        System.out.println("The avilable casts  are:");
        for (String cast : castsNames)
            System.out.println(cast);
    }
public String getCastByName(String castsName)
	{
		String name = null;
		for(String  cast :castsNames)
		{
			if(cast == castsName)
			{
				name = cast;
				
				
			}
		}
		if(name == null)
			System.out.println(castsName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedCast(String existingCastName, String updatedCastName)
	{
	boolean isCastUpdated = false;

	for(int index = 0; index < castsNames.length;index++)
	{
		if(castsNames[index] == existingCastName)
		{
			castsNames[index] = updatedCastName;
			isCastUpdated  = true;
		}
	}
		if(isCastUpdated == false)
		{
			System.out.println(existingCastName+"not found");
			
		}
			return isCastUpdated;
			
	}
}



