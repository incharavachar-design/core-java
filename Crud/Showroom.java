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
}