class Ibacco
{
String iceCreams[] = new String[10];
int index;

public boolean addIceCream(String iceCream)
{
	boolean isIceCreamAdded = false;
	if(index < iceCreams.length)
	{

	
	if (iceCream != null && !iceCream.isEmpty())
	{
	iceCreams[index++] = iceCream;
	isIceCreamAdded = true;
	}
	else
	
	System.out.println(iceCream +"is not valid");
	}
	else
		System.out.println("Ice cream is not available for now");
	
	return isIceCreamAdded;
	}
	
	public void getIceCreamDetails()
	{
	System.out.println("The available Icecreams are :");
	for(String ice : iceCreams)
	System.out.println(ice);
	}

	public String getIceCreamByName(String iceCreamName)
	{
		String name = null;
		for(String  iceCream :iceCreams)
		{
			if(iceCream == iceCreamName)
			{
				name = iceCream;
				
				
			}
		}
		if(name == null)
			System.out.println(iceCreamName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedIceCream(String existingIceCreamName, String updatedIceCreamName)
	{
	boolean isIceCreamUpdated = false;

	for(int index = 0; index<iceCreams.length;index++)
	{
		if(iceCreams[index] == existingIceCreamName)
		{
			iceCreams[index] = updatedIceCreamName;
			isIceCreamUpdated  = true;
		}
	}
		if(isIceCreamUpdated == false)
		{
			System.out.println(existingIceCreamName+"not found");
			
		}
			return isIceCreamUpdated;
			
	}
	
	public boolean deleteIceCream(String iceCream)
	{
	boolean isIceCreamDeleted = false;
	
	if(iceCreams[index] != null && !iceCreams.isEmpty())
		{
	for(int index = 0;index < iceCreams.length;index++)
	{
		
			if (iceCreams[index] != null && iceCreams[index].equals(iceCream)) 
			{
	iceCreams[index++] = iceCream;
	isIceCreamDeleted = true;
	}
	}
		}
	else{
	
		System.out.println("Ice cream is not available for now");
	}
	return isIceCreamDeleted;
	}

}





