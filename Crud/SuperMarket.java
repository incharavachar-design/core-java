class SuperMarket
{
String products[] = new String[8];
int index;

public boolean addProduct(String product)
{
boolean isAddedProduct = false;

if(product != null && !product.isEmpty())
{
products[index++]= product;
isAddedProduct = true;
}
else

System.out.println(product+"is not valid");

return isAddedProduct;
}
public void getProduct()
{
System.out.println("The available products are:");
for(String product :  products)
System.out.println(product);
}
}
