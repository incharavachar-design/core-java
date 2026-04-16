class Hospital
{
	Doctor doctors[] = new Doctor[1];
	int index;
	
	public boolean createDoctor(Doctor doctor)
	{
	boolean isDoctorAdded = false;
	boolean isDoctorIdAdded = false;
	boolean isDoctorNameAdded = false;
	boolean isDoctorFeesAdded = false;
	
	if(doctor.doctorId>0)
	{
	isDoctorIdAdded = true;
	}
	
	if(doctor.doctorName != null && !doctor.doctorName.isEmpty())
	{
	isDoctorNameAdded = true;
	}
	
	if(doctor.fees>500)
	{
	isDoctorFeesAdded = true;
	}
	
	if(isDoctorIdAdded && isDoctorNameAdded &&  isDoctorFeesAdded ){
	
	doctors[index++] = doctor;
	isDoctorAdded = true;
	
	}
	return isDoctorAdded;
	}
	
	public void getDoctorAllDetails()
	{
	for(Doctor doctor : doctors){
	System.out.println("Doctor ID is :" + doctor.doctorId);
	System.out.println("Doctor Name is :" + doctor.doctorName);
	System.out.println("Doctor fees is :" + doctor.fees);
	
	}	
	}
}