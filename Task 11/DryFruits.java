class DryFruits
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Premium Harvest");
      return "Premium Harvest";
   }

   public static String getMainType()
   {
      System.out.println("getMainType() invoked");
      System.out.println("Mixed Dry Fruits");
      return "Mixed Dry Fruits";
   }

   public static String getIncludedItems()
   {
      System.out.println("getIncludedItems() invoked");
      System.out.println("Almonds");
      System.out.println("Cashews");
      System.out.println("Raisins");
      System.out.println("Pistachios");
      return "Included Items Displayed";
   }

   public static int getWeightInGrams()
   {
      System.out.println("getWeightInGrams() invoked");
      System.out.println("500 Grams");
      return 500;
   }

   public static String getHealthBenefits()
   {
      System.out.println("getHealthBenefits() invoked");
      System.out.println("Rich in Protein");
      return "Health Benefits Displayed";
   }

   public static String getPackagingType()
   {
      System.out.println("getPackagingType() invoked");
      System.out.println("Airtight Box");
      return "Airtight Box";
   }
}