class DishWasher
{
    static int maxWashLevel = 5;
    static int minWashLevel = 0;
    static int currentWashLevel;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The dishwasher power is On");
        }
        else
        {
            System.out.println("The dishwasher power is Off");
        }
    }

    static void increaseWashLevel()
    {
        if(powerOn)
        {
            if(currentWashLevel < maxWashLevel)
            {
                currentWashLevel++;
                System.out.println("Wash level increased: " + currentWashLevel);
            }
            else
            {
                System.out.println("Reached maximum wash level");
            }
        }
        else
        {
            System.out.println("The dishwasher is Off");
        }
    }

    static void decreaseWashLevel()
    {
        if(powerOn)
        {
            if(currentWashLevel > minWashLevel)
            {
                currentWashLevel--;
                System.out.println("Wash level decreased: " + currentWashLevel);
            }
            else
            {
                System.out.println("Reached minimum wash level");
            }
        }
        else
        {
            System.out.println("The dishwasher is Off");
        }
    }
}

