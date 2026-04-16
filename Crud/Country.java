class Country
{
String stateNames[] = new String[29];
int index;

public boolean addStateName(String stateName)
{
	boolean isStateNameAdded = false;
	
	if(stateName != null && !stateName.isEmpty())
	{
	stateNames[index++] = stateName;
	isStateNameAdded = true;
	}
	else
	System.out.println(stateName +"is not valid");
	
	return isStateNameAdded;
	}
	
	public void getStateName()
	{
	System.out.println("The available state names are :");
	for(String state : stateNames)
	System.out.println(state);
	}
	}
	
	
