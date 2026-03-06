class DiningTableEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + DiningTable.getBrand());
      
      System.out.println("Material: " + DiningTable.getMaterial());
      
      System.out.println("Seating Capacity: " + DiningTable.getSeatingCapacity() + " Persons");
      
      System.out.println("Shape: " + DiningTable.getShape());
      
      System.out.println("Color: " + DiningTable.getColor());
      
      System.out.println("Warranty: " + DiningTable.getWarrantyYears() + " Years");
      
      System.out.println("Special Features: " + DiningTable.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}