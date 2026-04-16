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
}