class BikesEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Bike.getBrand());
      
      System.out.println("Type: " + Bike.getType());
      
      System.out.println("Flywheel Weight: " + Bike.getFlywheelWeight() + " Kg");
      
      System.out.println("Weight Capacity: " + Bike.getWeightCapacity() + " Kg");
      
      System.out.println("Resistance Type: " + Bike.getResistanceType());
      
      System.out.println("Special Features: " + Bike.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}