package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		Library.demo();
	}

}

/* OUTPUT 
 * 	edu.neu.csye6200.Library.demo()...

	Without sorting

LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]
LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]

	Sort inventory by item TITLE

LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]
LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]

	Sort inventory by item ID

LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]

	Sort inventory by item CATEGORY

LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]

	Sort inventory by item AUTHOR

LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]
LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]

	Sort inventory by item SUBJECT

LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]

	Sort inventory by item ISBN

LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]

	Sort inventory by item PRICE

LibraryItem [Id=1, Title=My Chosen Career, Author=Daniel Peters, Category=BOOK, Subject=Non-Fiction, Isbn=212-217237718-7, Price=2.49]
LibraryItem [Id=3, Title=Java Easy, Author=Adam Peterson, Category=DVD, Subject=Science, Isbn=212-217237711-7, Price=7.49]
LibraryItem [Id=2, Title=Born Free, Author=Sam Jones, Category=CD, Subject=Non-Fiction, Isbn=212-217237713-7, Price=11.49]
*/
