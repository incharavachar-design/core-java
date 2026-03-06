class HerbersEx
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("Herb Name: " + Herbs.getHerbName());
      
      System.out.println("Scientific Name: " + Herbs.getScientificName());
      
      System.out.println("Used Part: " + Herbs.getUsedPart());
      
      System.out.println("Health Benefits: " + Herbs.getHealthBenefits());
      
      System.out.println("Usage Form: " + Herbs.getUsageForm());
      
      System.out.println("Shelf Life: " + Herbs.getShelfLifeMonths() + " Months");

      System.out.println("main ended");
      return;
   }
}