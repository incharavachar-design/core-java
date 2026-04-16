class Showroom {
    String managerNames[] = new String[8];
    int index;

    public boolean addManager(String manager) {
    boolean isManagerAdded = false;

    if (index < managerNames.length) {
    if (manager != null && !manager.isEmpty()) {
    managerNames[index++] = manager;
    isManagerAdded = true;
    } 
	else
    System.out.println(manager + " is not valid");
	}
	else System.out.println("this manager is not avaliable");
    return isManagerAdded;
        
    }

    public void getManager() {
        System.out.println("The avilable manager  are:");
        for (String manager : managerNames)
            System.out.println(manager);
    }
	public String getManagerByName(String managerName)
	{
		String name = null;
		for(String  manager :managerNames)
		{
			if(manager == managerName)
			{
				name = manager;
				
				
			}
		}
		if(name == null)
			System.out.println(managerName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedManager(String existingManagerName, String updatedManagerName)
	{
	boolean isManagerUpdated = false;

	for(int index = 0; index < managerNames.length;index++)
	{
		if(managerNames[index] == existingManagerName)
		{
			managerNames[index] = updatedManagerName;
			isManagerUpdated  = true;
		}
	}
		if(isManagerUpdated == false)
		{
			System.out.println(existingManagerName+"not found");
			
		}
			return isManagerUpdated;
			
	}
}


