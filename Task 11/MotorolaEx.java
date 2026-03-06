class MotorolaEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Brand: " + MotorolaMobile.getBrand());
      
      System.out.println("Model: " + MotorolaMobile.getModel());
      
      System.out.println("Processor: " + MotorolaMobile.getProcessor());
      
      System.out.println("RAM: " + MotorolaMobile.getRAM() + " GB");
      
      System.out.println("Storage: " + MotorolaMobile.getStorage() + " GB");
      
      System.out.println("Camera: " + MotorolaMobile.getCameraDetails());
      
      System.out.println("Battery: " + MotorolaMobile.getBatteryDetails());

      System.out.println("main ended");
      return;
   }
}