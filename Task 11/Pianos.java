class Pianos
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Yamaha");
      return "Yamaha";
   }

   public static String getType()
   {
      System.out.println("getType() invoked");
      System.out.println("Digital Piano");
      return "Digital Piano";
   }

   public static int getNumberOfKeys()
   {
      System.out.println("getNumberOfKeys() invoked");
      System.out.println("88 Keys");
      return 88;
   }

   public static String getColor()
   {
      System.out.println("getColor() invoked");
      System.out.println("Black");
      return "Black";
   }

   public static String getSoundQuality()
   {
      System.out.println("getSoundQuality() invoked");
      System.out.println("Grand Piano Sound Sampling");
      return "Grand Piano Sound Sampling";
   }

   public static String getSpecialFeatures()
   {
      System.out.println("getSpecialFeatures() invoked");
      System.out.println("Weighted Keys");
      System.out.println("Built-in Speakers");
      System.out.println("Recording Function");
      return "Special Features Displayed";
   }
}