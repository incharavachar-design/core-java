class Line
{
    public static void sendSticker(String friend)
    {
        System.out.println("Sticker sent to " + friend);
    }

    public static void sendSticker(String friend, String stickerName)
    {
        System.out.println("Sticker sent to " + friend);
        System.out.println("Sticker: " + stickerName);
    }
}