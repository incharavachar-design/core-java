class GheeEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + Ghee.getBrand());
      
      System.out.println("Type: " + Ghee.getType());
      
      System.out.println("Packaging: " + Ghee.getPackagingType());
      
      System.out.println("Quantity: " + Ghee.getQuantityInGrams() + " grams");
      
      System.out.println("Health Benefits: " + Ghee.getHealthBenefits());
      
      System.out.println("Storage: " + Ghee.getStorageInstructions());

      System.out.println("main ended");
      return;
   }
}