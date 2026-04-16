class DigitalZone
{
String laptopBrands[] = new String[6];
 int index;
 
public boolean addLaptopBrand(String laptopBrand)
{
	boolean isAddedLaptopBrand = false;
	
	if(laptopBrand != null && !laptopBrand.isEmpty())
	{
	laptopBrands[index++]= laptopBrand;
	 isAddedLaptopBrand = true;
	}
	else
	 
	System.out.println(laptopBrand +"is not valid");
	
	return isAddedLaptopBrand;
	}
	
	public void getLaptopBrand()
	{
	System.out.println("The available Laptop Brands are:");
	
	for(String laptop : laptopBrands)
	System.out.println(laptop);
	}
	}