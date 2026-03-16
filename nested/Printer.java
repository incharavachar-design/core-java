class Printer
{
    static int maxPages = 20;
    static int minPages = 0;
    static int currentPages;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The printer power is On");
        }
        else
        {
            System.out.println("The printer power is Off");
        }
    }

    static void increasePages()
    {
        if(powerOn)
        {
            if(currentPages < maxPages)
            {
                currentPages++;
                System.out.println("Pages increased: " + currentPages);
            }
            else
            {
                System.out.println("Reached maximum page limit");
            }
        }
        else
        {
            System.out.println("The printer is Off");
        }
    }

    static void decreasePages()
    {
        if(powerOn)
        {
            if(currentPages > minPages)
            {
                currentPages--;
                System.out.println("Pages decreased: " + currentPages);
            }
            else
            {
                System.out.println("Reached minimum page limit");
            }
        }
        else
        {
            System.out.println("The printer is Off");
        }
    }
}

