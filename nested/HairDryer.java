class HairDryer
{
    static int maxHeatLevel = 5;
    static int minHeatLevel = 0;
    static int currentHeatLevel;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The hair dryer power is On");
        }
        else
        {
            System.out.println("The hair dryer power is Off");
        }
    }

    static void increaseHeat()
    {
        if(powerOn)
        {
            if(currentHeatLevel < maxHeatLevel)
            {
                currentHeatLevel++;
                System.out.println("Heat level increased: " + currentHeatLevel);
            }
            else
            {
                System.out.println("Reached maximum heat level");
            }
        }
        else
        {
            System.out.println("The hair dryer is Off");
        }
    }

    static void decreaseHeat()
    {
        if(powerOn)
        {
            if(currentHeatLevel > minHeatLevel)
            {
                currentHeatLevel--;
                System.out.println("Heat level decreased: " + currentHeatLevel);
            }
            else
            {
                System.out.println("Reached minimum heat level");
            }
        }
        else
        {
            System.out.println("The hair dryer is Off");
        }
    }
}

