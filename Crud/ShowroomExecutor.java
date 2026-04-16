class ShowroomExecutor
{
public static void main(String []  s)
{
Showroom manager = new Showroom();
boolean added = manager.addManager("Ram");
System.out.println(added);

added = manager.addManager("Krishna");
System.out.println(added);

added = manager.addManager("Yuvraj");
System.out.println(added);

added = manager.addManager("Priyanka");
System.out.println(added);

added = manager.addManager("Gouri");
System.out.println(added);

added = manager.addManager("Neha");
System.out.println(added);

added = manager.addManager("Samarth");
System.out.println(added);

added = manager.addManager("Keerthan");
System.out.println(added);


manager.getManager();
}
}