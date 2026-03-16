class Earbuds
{
    static int maxVolume = 10;
    static int minVolume = 0;
    static int currentVolume;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The earbuds power is On");
        }
        else
        {
            System.out.println("The earbuds power is Off");
        }
    }

    static void increaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume < maxVolume)
            {
                currentVolume++;
                System.out.println("Volume increased: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum volume");
            }
        }
        else
        {
            System.out.println("The earbuds are Off");
        }
    }

    static void decreaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume > minVolume)
            {
                currentVolume--;
                System.out.println("Volume decreased: " + currentVolume);
            }
            else
            {
                System.out.println("Reached minimum volume");
            }
        }
        else
        {
            System.out.println("The earbuds are Off");
        }
    }
}

