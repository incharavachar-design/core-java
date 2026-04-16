class MedicalShopExecutor
{
public static void main(String []  m)
{
MedicalShop shop = new MedicalShop();
boolean added = shop.addMedicineNames("Dolo 650");
System.out.println(added);

added = shop.addMedicineNames("Cetirizine");
System.out.println(added);

added = shop.addMedicineNames("Azithromycin");
System.out.println(added);

added = shop.addMedicineNames("Pantoprazole");
System.out.println(added);

added = shop.addMedicineNames("Zinc tablets");
System.out.println(added);

added = shop.addMedicineNames("Aceclofenac");
System.out.println(added);

added = shop.addMedicineNames("Dextromethorphan");
System.out.println(added);

added = shop.addMedicineNames("Losartan");
System.out.println(added);

added = shop.addMedicineNames("Hydrocortisone");
System.out.println(added);

added = shop.addMedicineNames("Domperidone");
System.out.println(added);




shop.getMedicineName();
}
}