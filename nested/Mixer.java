class Mixer
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
            System.out.println("The mixer power is On");
        }
        else
        {
            System.out.println("The mixer power is Off");
        }
    }

    static void increaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed < maxSpeed)
            {
                currentSpeed++;
                System.out.println("Increased speed: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached maximum speed");
            }
        }
        else
        {
            System.out.println("The mixer is Off");
        }
    }

    static void decreaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed > minSpeed)
            {
                currentSpeed--;
                System.out.println("Decreased speed: " + currentSpeed);
            }
            else
            {
                System.out.println("Reached minimum speed");
            }
        }
        else
        {
            System.out.println("The mixer is Off");
        }
    }
}

