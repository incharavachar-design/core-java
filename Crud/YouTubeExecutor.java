class YouTubeExecutor
{
public static void main(String []  you)
{
YouTube videoTitle = new YouTube();
boolean added = videoTitle.addVideoTitleNames("Complete Guide for Beginners ");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Build This AI Project Step by Step");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Try Not to Laugh Challenge");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Top 10 Things You Must Know in 2026");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Glow Up Routine That Actually Works");
System.out.println(added);

added = videoTitle.addVideoTitleNames("When You Study One Day Before Exam");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Glow Up Routine for Beginners");
System.out.println(added);

added = videoTitle.addVideoTitleNames("You Won’t Believe What Happened");
System.out.println(added);

added = videoTitle.addVideoTitleNames("Secrets Nobody Tells You");
System.out.println(added);




videoTitle.getVideoTitle();
}
}