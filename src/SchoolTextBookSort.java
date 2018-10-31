/*
 * Zachary Miller
 * 7/11/2018
 * bellevue university
 * SchoolTextBookSort.java
 * This program creates instances of SchoolTextBook and stores them in a list. It asks user how they want it sorted 
 * and then calls the proper sorting method. Then prints the list. 
 * only isbn and page count are sorting dont know why other two are not
 */
import java.util.*;
import javax.swing.*;
public class SchoolTextBookSort {

	public static void main(String[] args) {
		List<SchoolTextBook> books = new ArrayList<>();
	       books.add(new SchoolTextBook("Coronel", "Database Systems", 751, "9781285196145"));
	       books.add(new SchoolTextBook("Ben-Gan", "Microsoft SQL Server 2012 T-SQL Fundamentals", 412, "9780735658141"));
	       books.add(new SchoolTextBook("Farrell", "Java Programming", 994, "9781285856919"));
	       books.add(new SchoolTextBook("Ford", "Ruby Programming", 421, "9781111222376"));
	       books.add(new SchoolTextBook("Sebesta", "Programming the World Wide Web", 792, "9780133775983"));
	       String rawInput = null;
	       int sortBy = 0;
	       boolean inputGood = false;
	       do{
	    	   try
	    	   {
	    		   rawInput = JOptionPane.showInputDialog("Please choose how you would like the books sorted by "
	    		   		+ "(Author, Title, Page Count, or ISBN): ");
	    		   if(rawInput.equalsIgnoreCase("author")||rawInput.equalsIgnoreCase("title")||rawInput.equalsIgnoreCase("page count")|| rawInput.equalsIgnoreCase("ISBN"))
	    		   {
	    			   inputGood=true;
	    		   }
	    		   else
	    		   {
	    			   inputGood=false;
	    			   rawInput=null;
	    		   }
	    			   
	    	   }catch(NullPointerException e)
	    	   {
	    		   System.exit(0);
	    	   }
	       }while(inputGood==false);
	       
	       if(rawInput.equalsIgnoreCase("author"))
	       {
	    	   sortBy=1;
	       }
	       else if(rawInput.equalsIgnoreCase("title"))
	       {
	    	   sortBy=2;
	       }
	       else if(rawInput.equalsIgnoreCase("page count"))
	       {
	    	   sortBy=3;
	       }
	       else
	       {
	    	   sortBy=4;
	       }
	       
	       switch (sortBy)
	       {
	       case 1://author
	    	   Collections.sort(books, new SchoolTextBookAuthorComparator());
	           break;
	       case 2://title
	    	   Collections.sort(books, new SchoolTextBookTitleComparator());
	           break;
	       case 3://page count
	    	   Collections.sort(books, new SchoolTextBookPageCountComparator());	          
	           break;
	       case 4://isbn
	    	   Collections.sort(books, new SchoolTextBookISBNComparator());
	           break;
	       }
	       
	       for (SchoolTextBook b : books) {
	    	   System.out.println(b);
	       }
	}

}
