class Kettle
{
    static int maxTemperature = 100;
    static int minTemperature = 0;
    static int currentTemperature;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The kettle power is On");
        }
        else
        {
            System.out.println("The kettle power is Off");
        }
    }

    static void increaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature < maxTemperature)
            {
                currentTemperature++;
                System.out.println("Temperature increased: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached maximum temperature");
            }
        }
        else
        {
            System.out.println("The kettle is Off");
        }
    }

    static void decreaseTemperature()
    {
        if(powerOn)
        {
            if(currentTemperature > minTemperature)
            {
                currentTemperature--;
                System.out.println("Temperature decreased: " + currentTemperature);
            }
            else
            {
                System.out.println("Reached minimum temperature");
            }
        }
        else
        {
            System.out.println("The kettle is Off");
        }
    }
}

