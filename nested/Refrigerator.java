class Refrigerator
{
    static int maxTemperature = 10;
    static int minTemperature = 1;
    static int currentTemperature;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The refrigerator power is On");
        }
        else
        {
            System.out.println("The refrigerator power is Off");
        }
    }

    static void increaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature < maxTemperature)
            {
                currentTemperature++;
                System.out.println("Increased temperature: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached maximum temperature");
            }
        }
        else
        {
            System.out.println("The refrigerator is Off");
        }
    }

    static void decreaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature > minTemperature)
            {
                currentTemperature--;
                System.out.println("Decreased temperature: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached minimum temperature");
            }
        }
        else
        {
            System.out.println("The refrigerator is Off");
        }
    }
}

