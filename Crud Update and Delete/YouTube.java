class YouTube
{
    String videoTitleNames[] = new String[9];
    int index;

    public boolean addVideoTitleNames(String videoTitle) 
	{
    boolean isVideoTitleAdded = false;

    if (index < videoTitleNames.length) 
	{
    if (videoTitle != null && !videoTitle.isEmpty()) 
	{
    videoTitleNames[index++] = videoTitle;
    isVideoTitleAdded = true;
    } 
	else
    System.out.println(videoTitle + " is not valid");
	}
	else System.out.println("this videoTitle not avaliable");
    return isVideoTitleAdded;
        
    }

    public void getVideoTitle() 
	{
        System.out.println("The avilable videoTitle  are:");
        for (String videoTitle : videoTitleNames)
            System.out.println(videoTitle);
    }
public String getVideoTitleByName(String videoTitleName)
{
	String name = null;
	for(String videoTitle:videoTitleNames)
	{
		if(videoTitle == videoTitleName)
		{
			name = videoTitle;
		}
	}
	if(name == null)
		System.out.println(videoTitleName+"is not found");
	return name;
}
public boolean updatedVideoTitle(String existingVideoTitleName,String updatedVideoTitleName)
{
	boolean isVideoTitleUpdated = false;
	for(int index =0; index < videoTitleNames.length;index++)
	{
		if(videoTitleNames[index]== existingVideoTitleName)
		{
			videoTitleNames[index]= updatedVideoTitleName;
			isVideoTitleUpdated = true;
		}
	}
	if(isVideoTitleUpdated == false)
	{
		System.out.println(existingVideoTitleName+"is not found");
	}
	return isVideoTitleUpdated;
}
}