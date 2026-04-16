class Library
{

String bookNames[] = new String[13];
int index;

public boolean addBookName(String bookName)
{
boolean isAddedBookName = false;

if(bookName != null && !bookName.isEmpty())
{
bookNames [index++]= bookName;
isAddedBookName = true;
}
else

System.out.println(bookName+"is not valid");

return isAddedBookName;
}
public void getBookName()
{
System.out.println("The available Books are:");
for(String book :  bookNames)
System.out.println(book);
}
}
