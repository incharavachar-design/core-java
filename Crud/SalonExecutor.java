class SalonExecutor
{
public static void main(String []  s)
{
Salon service = new Salon();
boolean added = service.addService("Hair Cut");
System.out.println(added);

added = service.addService("Head Masag");
System.out.println(added);

added = service.addService("Hair Styling");
System.out.println(added);

added = service.addService("Hair Coloring");
System.out.println(added);

added = service.addService("Facial");
System.out.println(added);

added = service.addService("Nail Services");
System.out.println(added);

added = service.addService("Makeup And Bridal Services");
System.out.println(added);




service.getService();
}
}