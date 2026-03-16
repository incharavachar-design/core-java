class Tab
{
    static int maxBrightness = 8;
    static int minBrightness = 0;
    static int currentBrightness;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The tablet power is On");
        }
        else
        {
            System.out.println("The tablet power is Off");
        }
    }

    static void increaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness < maxBrightness)
            {
                currentBrightness++;
                System.out.println("Brightness increased: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached maximum brightness");
            }
        }
        else
        {
            System.out.println("The tablet is Off");
        }
    }

    static void decreaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness > minBrightness)
            {
                currentBrightness--;
                System.out.println("Brightness decreased: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached minimum brightness");
            }
        }
        else
        {
            System.out.println("The tablet is Off");
        }
    }
}

