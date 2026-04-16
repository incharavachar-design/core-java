class DigitalZoneExecutor
{
public static void main(String [] Digital)
{
	DigitalZone laptop = new DigitalZone();
	boolean added = laptop.addLaptopBrand("Dell");
	System.out.println(added);
	
	added = laptop.addLaptopBrand("hp");
	System.out.println(added);
	
	added = laptop.addLaptopBrand("Lenova");
	System.out.println(added);
	
	added = laptop.addLaptopBrand("Apple");
	System.out.println(added);
	
	added = laptop.addLaptopBrand("ThinkPad");
	System.out.println(added);
	
	added = laptop.addLaptopBrand("Samsung");
	System.out.println(added);
	
	laptop.getLaptopBrand();
	}
	}