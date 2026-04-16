class MovieExecutor
{
public static void main(String []  m)
{
Movie cast = new Movie();
boolean added = cast.addCast("Ranveer Singh");
System.out.println(added);

added = cast.addCast("Adithya Dhar");
System.out.println(added);

added = cast.addCast("Akhasy Khanna");
System.out.println(added);

added = cast.addCast("Sanjay Datt");
System.out.println(added);

added = cast.addCast("Arjun Rampal");
System.out.println(added);

added = cast.addCast("Sumaya Tandon");
System.out.println(added);

added = cast.addCast("Gourav Gera");
System.out.println(added);

added = cast.addCast("Manav Gohil");
System.out.println(added);

added = cast.addCast("Rajat Arora");
System.out.println(added);

cast.getCasts();

String actor = cast.getCastByName("Manav Gohil");
	System.out.println(actor + " is available ");
	
	boolean castUpdated = cast.updatedCast("Rajat Arora", "Yash");
	System.out.println(castUpdated);
	
	cast.getCasts();
}
}