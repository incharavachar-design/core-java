class AirPurifier
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
            System.out.println("The air purifier power is On");
        }
        else
        {
            System.out.println("The air purifier power is Off");
        }
    }

    static void increaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed < maxSpeed)
            {
                currentSpeed++;
                System.out.println("Fan speed increased: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached maximum fan speed");
            }
        }
        else
        {
            System.out.println("The air purifier is Off");
        }
    }

    static void decreaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed > minSpeed)
            {
                currentSpeed--;
                System.out.println("Fan speed decreased: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached minimum fan speed");
            }
        }
        else
        {
            System.out.println("The air purifier is Off");
        }
    }
}

