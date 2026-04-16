class HospitalExecutor
{
	public static void main(String [] exe)
	{
	String lakshyaSpecializations[] = {"Heart Fitness"};
	
	Hospital hospital = new Hospital();
	
	Doctor doctor = new Doctor();
	doctor.doctorId = 1;
	doctor.doctorName = "Lakshya";
	doctor.fees = 300;
	
	boolean isDoctorAdd = hospital.createDoctor(doctor);
	System.out.println(isDoctorAdd);

	hospital.getDoctorAllDetails();
	}
}