package ai.jobiak.collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> bookList=new ArrayList<String>();
		System.out.println(bookList.size());
		bookList.add("Thinking in Java");
		bookList.add("Java Unleashed");
		bookList.add("Java for Dummies in 21 days");
		bookList.add("Head First Java");
		bookList.add("Java in Action");
        
		System.out.println(bookList.size());
		System.out.println(bookList);
		bookList.add("Head First Design Patterns");
		bookList.add("The Java EE Server Programming");
		
		System.out.println(bookList.size());
		//System.out.println(bookList);
		System.out.println(bookList.get(4));
		System.out.println(bookList.contains("Thinking in Java"));
		List list=bookList;
		System.out.println(list);
		Collection collection=list;
		System.out.println(collection);
		
		//iterator
		//Iterator iter=collection.iterator();
		//Iterator iter=list.iterator();
		Iterator iter=bookList.iterator();
		while(hasNext()) {
			System.out.println(iter.next());
		}
	     for(Object book:bookList) {
	    	 System.out.println(book);
	     }
	     for(int i=0;i<bookList.size();i++) {
	    	 System.out.println(bookList.get(i));
	     }
	     Collections.sort(bookList);
	     System.out.println(bookList);
	    int foundAt= Collections.binarySearch(bookList,"Head First Java");
	     System.out.println(foundAt);
	     System.out.println(bookList);
         
	     Object books[]=collection.toArray();
	     System.out.println(books.length);
	     
	     List listOfBooks=Arrays.asList(books);
	     System.out.println(listOfBooks);
	}
	

	private static boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
}
	