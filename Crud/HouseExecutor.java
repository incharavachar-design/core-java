class HouseExecutor
{
public static void main(String []  h)
{
House indoorGame = new House();
boolean added = indoorGame.addIndoorGames("Chess ");
System.out.println(added);

added = indoorGame.addIndoorGames("Carrom");
System.out.println(added);

added = indoorGame.addIndoorGames("Table Tennis");
System.out.println(added);

added = indoorGame.addIndoorGames("Hide and Seek");
System.out.println(added);

added = indoorGame.addIndoorGames("Ludo");
System.out.println(added);

added = indoorGame.addIndoorGames("Snakes and Ladders");
System.out.println(added);

added = indoorGame.addIndoorGames("Air Hockey");
System.out.println(added);

added = indoorGame.addIndoorGames("Rubik's Cube");
System.out.println(added);

added = indoorGame.addIndoorGames("Treasure Hunt");
System.out.println(added);




indoorGame.getIndoorGame();
}
}