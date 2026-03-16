class Fan
{
    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The fan power is On");
        }
        else
        {
            System.out.println("The fan power is Off");
        }
    }

    static void increaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed < maxSpeed)
            {
                currentSpeed++;
                System.out.println("Increased fan speed: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached maximum fan speed");
            }
        }
        else
        {
            System.out.println("The fan is Off");
        }
    }

    static void decreaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed > minSpeed)
            {
                currentSpeed--;
                System.out.println("Decreased fan speed: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached minimum fan speed");
            }
        }
        else
        {
            System.out.println("The fan is Off");
        }
    }
}

