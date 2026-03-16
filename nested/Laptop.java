class Laptop
{
    static int maxBrightness = 10;
    static int minBrightness = 0;
    static int currentBrightness;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The laptop power is On");
        }
        else
        {
            System.out.println("The laptop power is Off");
        }
    }

    static void increaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness < maxBrightness)
            {
                currentBrightness++;
                System.out.println("Increased brightness: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached maximum brightness");
            }
        }
        else
        {
            System.out.println("The laptop is Off");
        }
    }

    static void decreaseBrightness()
    {
        if(powerOn)
        {
            if(currentBrightness > minBrightness)
            {
                currentBrightness--;
                System.out.println("Decreased brightness: " + currentBrightness);
            }
            else
            {
                System.out.println("Reached minimum brightness");
            }
        }
        else
        {
            System.out.println("The laptop is Off");
        }
    }
}

