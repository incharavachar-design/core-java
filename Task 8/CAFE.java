class CAFE
{
	static String teaNames[] = {"BlackTea","MasalaTea","AmruthTea","GreenTea","LemonTea","GingerTea"};
	static String coffeeNames[] = {"ColdCoffee","EspressoCoffee","CappuccinoCoffee","LatteCoffee","AmericanoCoffee","VCoffee"};
	static String snaksNames[] ={"Samosa","Pakoda","Sandwich","FrenchFries","Burger"};
	
	
 public static void main(String []cafe)
{
	getTeamNames();
	getcoffeeNames();
	getsnaksNames();
}
	static void getTeamNames(){
			System.out.println("The avialable tea names are:");
		for(String teaName : teaNames)
			{
				System.out.println(teaName);
			}
		}
	
	static void getcoffeeNames(){
		System.out.println("The avialable coffeeNames names are:");
	for(String coffeeName : coffeeNames)
		{
			System.out.println(coffeeName);
			
		}
	}
	
	static void getsnaksNames(){
		System.out.println("The avialable coffeeNames names are:");
	for(String snaksName : snaksNames )
		{
			System.out.println(snaksName);
		}
	}
}
	