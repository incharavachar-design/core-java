class YouTubeExecutor
{
public static void main(String []  you)
{
YouTube videoTitle = new YouTube();
boolean added = videoTitle.addVideoTitleNames("Complete Guide for Beginners \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Build This AI Project Step by Step \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Try Not to Laugh Challenge \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Top 10 Things You Must Know in 2026 \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Glow Up Routine That Actually Works \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("When You Study One Day Before Exam \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Glow Up Routine for Beginners \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("You Won’t Believe What Happened \n");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Secrets Nobody Tells You \n");
System.out.println(added);




videoTitle.getVideoTitle();

String video = videoTitle.getVideoTitleByName("Secrets Nobody Tells You ");
	System.out.println(video +"is available \n");
	
	boolean videoTitleUpdated = videoTitle.updatedVideoTitle("Top 10 Things You Must Know in 2026"," Top 10 Things You Must Know in Your Life");
	System.out.println(videoTitleUpdated);
	
	videoTitle.getVideoTitle();
	}
}


