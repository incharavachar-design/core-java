class Ghee
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Amul");
      return "Amul";
   }

   public static String getType()
   {
      System.out.println("getType() invoked");
      System.out.println("Pure Cow Ghee");
      return "Pure Cow Ghee";
   }

   public static String getPackagingType()
   {
      System.out.println("getPackagingType() invoked");
      System.out.println("Jar");
      return "Jar";
   }

   public static int getQuantityInGrams()
   {
      System.out.println("getQuantityInGrams() invoked");
      System.out.println("500 Grams");
      return 500;
   }

   public static String getHealthBenefits()
   {
      System.out.println("getHealthBenefits() invoked");
      System.out.println("Improves Digestion");
      return "Health Benefits Displayed";
   }

   public static String getStorageInstructions()
   {
      System.out.println("getStorageInstructions() invoked");
      System.out.println("Store in a Cool and Dry Place");
      return "Storage Instructions Displayed";
   }
}