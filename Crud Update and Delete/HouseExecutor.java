class HouseExecutor
{
public static void main(String []  h)
{
House game = new House();
boolean added = game.addIndoorGames("Chess \n");
System.out.println(added);

added = game.addIndoorGames("Carrom \n");
System.out.println(added);

added = game.addIndoorGames("Table Tennis \n");
System.out.println(added);

added = game.addIndoorGames("Hide and Seek \n ");
System.out.println(added);

added = game.addIndoorGames("Ludo");
System.out.println(added);

added = game.addIndoorGames("Snakes and Ladders \n");
System.out.println(added);

added = game.addIndoorGames("Air Hockey \n");
System.out.println(added);

added = game.addIndoorGames("Rubik's Cube \n");
System.out.println(added);

added = game.addIndoorGames("Treasure Hunt \n");
System.out.println(added);

added = game.addIndoorGames("Snake And Ladder \n");
System.out.println(added);



game.getIndoorGame();


String indoorGame = game.getIndoorGameByName("Ludo ");
	System.out.println(indoorGame +"is available \n");
	
	boolean indoorGameUpdated = game.updatedIndoorGame("Treasure Hunt"," Musical Chair");
	System.out.println(indoorGameUpdated);
	
	game.getIndoorGame();
}
}