class SuperMarketExecutor
{
public static void main(String [] s)
{
SuperMarket market = new SuperMarket();
boolean added = market.addProduct("Chacolate");
System.out.println(added);

added = market.addProduct("Footwear");
System.out.println(added);

added = market.addProduct("Cloths");
System.out.println(added);

added = market.addProduct("Home Appliances");
System.out.println(added);

added = market.addProduct("Vegetables");
System.out.println(added);

added = market.addProduct("Toys");
System.out.println(added);

added = market.addProduct("Fruit");
System.out.println(added);

added = market.addProduct("Juice");
System.out.println(added);

market.getProduct();
}
}