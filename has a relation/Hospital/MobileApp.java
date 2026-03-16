class MobileApp
{
public static void register(String patientName,String symptom,String email,long mobileNo)
{
		System.out.println("Patient Name: " + patientName);
        System.out.println("Symptom: " + symptom);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobileNo);


	
		Reception.book("Inchara","cold","inchara@gmail.com",9078675645L);
}
}

