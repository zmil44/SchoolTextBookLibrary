/*
 * Zachary Miller
 * 7/11/2018
 * bellevue university
 * SchoolTextBook.java
 * This program sets the author title page count and isbn number for books. It also attempts to sort them using
 * comparators, however i for some reason can only get the page count and isbn to sort and not the title or author
 * i dont know why
 */
import java.util.Comparator;

public class SchoolTextBook{
	String author, title;
	int pageCount;
	String isbn;
	public SchoolTextBook()
	{
	
	}
	public SchoolTextBook(String authorName, String bookTitle, int noOfPages, String isbnNumber)
	{
		author = authorName;
		title = bookTitle;
		pageCount= noOfPages;
		isbn = isbnNumber;
	}
	public void setAuthor(String authorName)
	{
		author = authorName;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setTitle(String bookTitle)
	{
		title = bookTitle;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setPageCount(int noOfPages)
	{
		pageCount = noOfPages;
	}
	public int getPageCount()
	{
		return pageCount;
	}
	
	public void setIsbn(String isbnNumber)
	{
		isbn = isbnNumber;
	}
	public String getIsbn()
	{
		return isbn;
	}
	 @Override

	 public String toString() 
	 {	
		 return "SchoolTextBook [author=" + author + ", title=" + title + ", ISBN=" + isbn + ", page_count=" + pageCount+"]";
	 } 
}
	
	class SchoolTextBookAuthorComparator implements Comparator<SchoolTextBook> 
	{

		@Override

		public int compare(SchoolTextBook s1, SchoolTextBook s2) {
			return s1.getAuthor().compareTo(s2.getAuthor());
		}
	}

	class SchoolTextBookTitleComparator implements Comparator<SchoolTextBook> 
	{
		@Override
		public int compare(SchoolTextBook s1, SchoolTextBook s2)
		{
			return s1.getTitle().compareTo(s2.getTitle());
		}
	}

	class SchoolTextBookISBNComparator implements Comparator<SchoolTextBook> 
	{
		@Override
		public int compare(SchoolTextBook s1, SchoolTextBook s2) 
		{
			return s1.getIsbn().compareTo(s2.getIsbn());
		}

	}

	class SchoolTextBookPageCountComparator implements Comparator<SchoolTextBook> 
	{ 
		@Override
		public int compare(SchoolTextBook s1, SchoolTextBook s2)
		{
			if(s1.getPageCount() > s2.getPageCount())
			{
		       return 1;
			}
			else if(s1.getPageCount() == s2.getPageCount())
			{
		       return 0;
			}
			else
				return -1;
		}
	}

//reference https://www.geeksforgeeks.org/collections-sort-java-examples/
// https://reversecoding.net/java-8-comparator-how-to-sort-a-list/
