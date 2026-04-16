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
}