class IbaccoEx
{
public static void main(String [] ice)
{
Ibacco ref = new Ibacco();
	
	String iceCream = "ButterScotch";
	boolean added = ref.addIceCream(iceCream);
	System.out.println(iceCream +"is added");
	
	added = ref.addIceCream("Chacolate");
	System.out.println(added);
	
	added = ref.addIceCream("Vanilla");
	System.out.println(added);
	
	added = ref.addIceCream("Chiku");
	System.out.println(added);
	
	added = ref.addIceCream("Rabdi");
	System.out.println(added);
	
	added =ref.addIceCream("Pista");
	System.out.println(added);
	
	added = ref.addIceCream("BlackCurrent");
	System.out.println(added);
	
	added = ref.addIceCream("RedValvet");
	System.out.println(added);
	
	added = ref.addIceCream("Kulfi");
	System.out.println(added);
	
	added = ref.addIceCream("Gudbud");
	System.out.println(added);
	
	ref.getIceCreamDetails();
	}
}