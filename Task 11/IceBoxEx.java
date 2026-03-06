class IceBoxEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + IceBox.getBrand());
      
      System.out.println("Capacity: " + IceBox.getCapacityInLiters() + " Liters");
      
      System.out.println("Material: " + IceBox.getMaterial());
      
      System.out.println("Color: " + IceBox.getColor());
      
      System.out.println("Insulation Type: " + IceBox.getInsulationType());
      
      System.out.println("Special Features: " + IceBox.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}