class Router
{
    static int maxSignal = 5;
    static int minSignal = 0;
    static int currentSignal;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The router power is On");
        }
        else
        {
            System.out.println("The router power is Off");
        }
    }

    static void increaseSignal()
    {
        if(powerOn)
        {
            if(currentSignal < maxSignal)
            {
                currentSignal++;
                System.out.println("Signal strength increased: " + currentSignal);
            }
            else
            {
                System.out.println("Reached maximum signal strength");
            }
        }
        else
        {
            System.out.println("The router is Off");
        }
    }

    static void decreaseSignal()
    {
        if(powerOn)
        {
            if(currentSignal > minSignal)
            {
                currentSignal--;
                System.out.println("Signal strength decreased: " + currentSignal);
            }
            else
            {
                System.out.println("Reached minimum signal strength");
            }
        }
        else
        {
            System.out.println("The router is Off");
        }
    }
}

