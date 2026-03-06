class ElectricCycles
{
   public static String getBrand()
   {
      System.out.println("getBrand() invoked");
      System.out.println("Hero Lectro");
      return "Hero Lectro";
   }

   public static String getModel()
   {
      System.out.println("getModel() invoked");
      System.out.println("H3");
      return "H3";
   }

   public static String getBatteryType()
   {
      System.out.println("getBatteryType() invoked");
      System.out.println("Lithium-Ion Battery");
      return "Lithium-Ion Battery";
   }

   public static int getBatteryCapacityWh()
   {
      System.out.println("getBatteryCapacityWh() invoked");
      System.out.println("250 Wh");
      return 250;
   }

   public static int getTopSpeed()
   {
      System.out.println("getTopSpeed() invoked");
      System.out.println("25 km/h");
      return 25;
   }

   public static int getRangePerCharge()
   {
      System.out.println("getRangePerCharge() invoked");
      System.out.println("35 km");
      return 35;
   }

   public static String getSpecialFeatures()
   {
      System.out.println("getSpecialFeatures() invoked");
      System.out.println("Pedal Assist Mode");
      return "Special Features Displayed";
   }
}