class DryFruitsEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + DryFruits.getBrand());
      
      System.out.println("Type: " + DryFruits.getMainType());
      
      System.out.println("Included Items: " + DryFruits.getIncludedItems());
      
      System.out.println("Weight: " + DryFruits.getWeightInGrams() + " grams");
      
      System.out.println("Health Benefits: " + DryFruits.getHealthBenefits());
      
      System.out.println("Packaging: " + DryFruits.getPackagingType());

      System.out.println("main ended");
      return;
   }
}