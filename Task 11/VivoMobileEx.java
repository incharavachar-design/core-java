class VivoMobileEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + VivoMobile.getBrand());
      
      System.out.println("Model: " + VivoMobile.getModel());
      
      System.out.println("Processor: " + VivoMobile.getProcessor());
      
      System.out.println("RAM: " + VivoMobile.getRAM() + " GB");
      
      System.out.println("Storage: " + VivoMobile.getStorage() + " GB");
      
      System.out.println("Camera: " + VivoMobile.getCameraDetails());
      
      System.out.println("Battery: " + VivoMobile.getBatteryDetails());

      System.out.println("main ended");
      return;
   }
}