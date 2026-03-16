class OrderSystem
{
public static void takeOrder()
{
System.out.println("OrderSystem takes the order");
InventoryCheck.validate();
}
}