class VacuumCleaner
{
    static int maxPower = 5;
    static int minPower = 0;
    static int currentPower;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The vacuum cleaner power is On");
        }
        else
        {
            System.out.println("The vacuum cleaner power is Off");
        }
    }

    static void increasePower()
    {
        if(powerOn)
        {
            if(currentPower < maxPower)
            {
                currentPower++;
                System.out.println("Suction power increased: " + currentPower);
            }
            else
            {
                System.out.println("Reached maximum suction power");
            }
        }
        else
        {
            System.out.println("The vacuum cleaner is Off");
        }
    }

    static void decreasePower()
    {
        if(powerOn)
        {
            if(currentPower > minPower)
            {
                currentPower--;
                System.out.println("Suction power decreased: " + currentPower);
            }
            else
            {
                System.out.println("Reached minimum suction power");
            }
        }
        else
        {
            System.out.println("The vacuum cleaner is Off");
        }
    }
}

