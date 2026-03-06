class MobilePhone
{

static long mobileContext[] = {9380160936L, 9972716178L, 9876543203L, 9876543204L, 9876543205L, 9876543206L, 9876543207L, 9876543208L, 9876543209L,9876543210L, 9876543211L, 9876543212L, 
9876543213L, 9876543214L, 9876543215L, 9876543216L, 9876543217L, 9876543218L, 9876543219L, 9876543220L};

public static void main(String args[])
{
getMobileNumbers();
}

static void getMobileNumbers()
{
System.out.println("To print the mobile phone number:");
for(long mobileNumber : mobileContext)
{
System.out.println(mobileNumber);
}
}

}