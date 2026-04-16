class Ibacco
{
String iceCreams[] = new String[10];
int index;

public boolean addIceCream(String iceCream)
{
	boolean isIceCreamAdded = false;
	
		
	if (iceCream != null && !iceCream.isEmpty())
	{
	iceCreams[index++] = iceCream;
	isIceCreamAdded = true;
	}
	else
	
	System.out.println(iceCream +"is not valid");
	
	return isIceCreamAdded;
	}
	
	public void getIceCreamDetails()
	{
	System.out.println("The available Icecreams are :");
	for(String ice : iceCreams)
	System.out.println(ice);
	}

}

