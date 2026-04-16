class MedicalShop
{
String medicineNames[] = new String [10];
int index;

public boolean addMedicineNames(String medicineName)
{
boolean isAddedMedicineName = false;

if(medicineName!=null && !medicineName.isEmpty())
{
medicineNames[index++] = medicineName;
isAddedMedicineName = true;
}
else

System.out.println(medicineName+"is not valid");

return isAddedMedicineName;
}

public void getMedicineName()
{
System.out.println("The available Medicines are :");
for(String tablet : medicineNames)
System.out.println(tablet);
}
}





