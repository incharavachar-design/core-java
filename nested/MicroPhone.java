class MicroPhone
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
            System.out.println("The microphone power is On");
        }
        else
        {
            System.out.println("The microphone power is Off");
        }
    }

    static void increaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume < maxVolume)
            {
                currentVolume++;
                System.out.println("Microphone volume increased: " + currentVolume);
            }
            else
            {
                System.out.println("Reached maximum microphone volume");
            }
        }
        else
        {
            System.out.println("The microphone is Off");
        }
    }

    static void decreaseVolume()
    {
        if(powerOn)
        {
            if(currentVolume > minVolume)
            {
                currentVolume--;
                System.out.println("Microphone volume decreased: " + currentVolume);
            }
            else
            {
                System.out.println("Reached minimum microphone volume");
            }
        }
        else
        {
            System.out.println("The microphone is Off");
        }
    }
}

