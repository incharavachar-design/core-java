class LibraryExecutor
{
public static void main(String [] s)
{
Library book = new Library();
boolean added = book.addBookName("Lucifer Was Innocent");
System.out.println(added);

added = book.addBookName("The Alchemist");
System.out.println(added);

added = book.addBookName("The Little Prince");
System.out.println(added);

added = book.addBookName("Malgudi Days");
System.out.println(added);

added = book.addBookName("Wings of Fire");
System.out.println(added);

added = book.addBookName("You Can Win");
System.out.println(added);

added = book.addBookName("Who Moved My Cheese");
System.out.println(added);

added = book.addBookName("Wise and Otherwise");
System.out.println(added);

added = book.addBookName("The Blue Umbrella");
System.out.println(added);

added = book.addBookName("Animal Farm");
System.out.println(added);

added = book.addBookName("The Story of My Life");
System.out.println(added);

added = book.addBookName("Swami and Friends");
System.out.println(added);

added = book.addBookName("The Giving Tree");
System.out.println(added);

book.getBookName();
}
}