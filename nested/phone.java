class phone
{
    static int maxValue = 9;
    static int minValue = 0;
    static int currentVolume;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The power is On");
        }
        else
        {
            System.out.println("The power is Off");
        }
    }

    static void increaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume < maxValue)
            {
                currentVolume++;
                System.out.println("Increased volume: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum volume");
            }
        }
        else
        {
            System.out.println("The phone is Off");
        }
	}	
	static void decreaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume < minValue)
            {
                currentVolume--;
                System.out.println("decreasevolume: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum volume");
            }
        }
        else
        {
            System.out.println("The phone is Off");
        }
    }
}