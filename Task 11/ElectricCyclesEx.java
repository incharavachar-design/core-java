class ElectricCyclesEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + ElectricCycles.getBrand());
      
      System.out.println("Model: " + ElectricCycles.getModel());
      
      System.out.println("Battery Type: " + ElectricCycles.getBatteryType());
      
      System.out.println("Battery Capacity: " + ElectricCycles.getBatteryCapacityWh() + " Wh");
      
      System.out.println("Top Speed: " + ElectricCycles.getTopSpeed() + " km/h");
      
      System.out.println("Range per Charge: " + ElectricCycles.getRangePerCharge() + " km");
      
      System.out.println("Special Features: " + ElectricCycles.getSpecialFeatures());

      System.out.println("main ended");
      return;
   }
}