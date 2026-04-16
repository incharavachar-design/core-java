class YouTube
{
    String videoTitleNames[] = new String[9];
    int index;

    public boolean addVideoTitleNames(String videoTitle) {
    boolean isVideoTitleAdded = false;

    if (index < videoTitleNames.length) {
    if (videoTitle != null && !videoTitle.isEmpty()) {
    videoTitleNames[index++] = videoTitle;
    isVideoTitleAdded = true;
    } 
	else
    System.out.println(videoTitle + " is not valid");
	}
	else System.out.println("this videoTitle not avaliable");
    return isVideoTitleAdded;
        
    }

    public void getVideoTitle() {
        System.out.println("The avilable videoTitle  are:");
        for (String videoTitle : videoTitleNames)
            System.out.println(videoTitle);
    }
}