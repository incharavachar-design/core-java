class Camera
{
    static int maxZoom = 5;
    static int minZoom = 0;
    static int currentZoom;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The camera power is On");
        }
        else
        {
            System.out.println("The camera power is Off");
        }
    }

    static void increaseZoom()
    {
        if(powerOn)
        {
            if(currentZoom < maxZoom)
            {
                currentZoom++;
                System.out.println("Zoom increased: " + currentZoom);
            }
            else
            {
                System.out.println("Reached maximum zoom");
            }
        }
        else
        {
            System.out.println("The camera is Off");
        }
    }

    static void decreaseZoom()
    {
        if(powerOn)
        {
            if(currentZoom > minZoom)
            {
                currentZoom--;
                System.out.println("Zoom decreased: " + currentZoom);
            }
            else
            {
                System.out.println("Reached minimum zoom");
            }
        }
        else
        {
            System.out.println("The camera is Off");
        }
    }
}

