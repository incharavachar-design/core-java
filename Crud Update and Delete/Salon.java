class Salon
{
    String serviceNames[] = new String[7];
    int index;

    public boolean addService(String service) {
    boolean isServiceAdded = false;

    if (index < serviceNames.length) {
    if (service != null && !service.isEmpty()) {
    serviceNames[index++] = service;
    isServiceAdded = true;
    } 
	else
    System.out.println(service + " is not valid");
	}
	else System.out.println("this service is not avaliable");
    return isServiceAdded;
        
    }

    public void getService() {
        System.out.println("The avilable service  are:");
        for (String service : serviceNames)
            System.out.println(service);
    }
public String getServiceByName(String serviceName)
	{
		String name = null;
		for(String  service :serviceNames)
		{
			if(service == serviceName)
			{
				name = service;
				
				
			}
		}
		if(name == null)
			System.out.println(serviceName+"not found");
		return name ;
		
		
	}
	
	public boolean updatedService(String existingServiceName, String updatedServiceName)
	{
	boolean isServiceUpdated = false;

	for(int index = 0; index < serviceNames.length;index++)
	{
		if(serviceNames[index] == existingServiceName)
		{
			serviceNames[index] = updatedServiceName;
			isServiceUpdated  = true;
		}
	}
		if(isServiceUpdated == false)
		{
			System.out.println(existingServiceName+"not found");
			
		}
			return isServiceUpdated;
			
	}
}

