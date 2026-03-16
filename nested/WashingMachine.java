class WashingMachine
{
    static int maxLevel = 5;
    static int minLevel = 0;
    static int currentLevel;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The washing machine power is On");
        }
        else
        {
            System.out.println("The washing machine power is Off");
        }
    }

    static void increaseLevel()
    {
        if(powerOn)
        {
            if(currentLevel < maxLevel)
            {
                currentLevel++;
                System.out.println("Wash level increased: " + currentLevel);
            }
            else
            {
                System.out.println("Reached maximum wash level");
            }
        }
        else
        {
            System.out.println("The washing machine is Off");
        }
    }

    static void decreaseLevel()
    {
        if(powerOn)
        {
            if(currentLevel > minLevel)
            {
                currentLevel--;
                System.out.println("Wash level decreased: " + currentLevel);
            }
            else
            {
                System.out.println("Reached minimum wash level");
            }
        }
        else
        {
            System.out.println("The washing machine is Off");
        }
    }
}

