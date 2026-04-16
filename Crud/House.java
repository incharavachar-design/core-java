class House
{
    String indoorGames[] = new String[9];
    int index;

    public boolean addIndoorGames(String indoorGame) {
    boolean isIndoorGamesAdded = false;

    if (index < indoorGames.length) {
    if (indoorGame != null && !indoorGame.isEmpty()) {
    indoorGames[index++] = indoorGame;
    isIndoorGamesAdded = true;
    } 
	else
    System.out.println(indoorGame + " is not valid");
	}
	else System.out.println("this indoorGame not avaliable");
    return isIndoorGamesAdded;
        
    }

    public void getIndoorGame() {
        System.out.println("The avilable indoorGame  are:");
        for (String indoorGame : indoorGames)
            System.out.println(indoorGame);
    }
}