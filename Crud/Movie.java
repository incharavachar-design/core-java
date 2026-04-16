class Movie
{
String castsNames [] = new String[9];
int index;

    public boolean addCast(String cast) {
    boolean isCastAdded = false;

    if (index < castsNames.length) {
    if (cast != null && !cast.isEmpty()) {
    castsNames[index++] = cast;
    isCastAdded = true;
    } 
	else
    System.out.println(cast + " is not valid");
	}
	else System.out.println("this cast is not avaliable");
    return isCastAdded;
        
    }

    public void getCasts() {
        System.out.println("The avilable casts  are:");
        for (String cast : castsNames)
            System.out.println(cast);
    }
}
