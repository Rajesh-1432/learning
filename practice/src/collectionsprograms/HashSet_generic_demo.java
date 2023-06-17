package collectionsprograms;
import java.util.*;
class Book{
	int bid;
	String bname;
	String author;
	public Book(int bid,String bname,String author) {
		this.bid=bid;
		this.bname=bname;
		this.author=author;
		
	}
}

public class HashSet_generic_demo {

	public static void main(String[] args) {
		 HashSet<Book> hs=new HashSet();
		hs.add(new Book(201, "c", "james"));
		hs.add(new Book(202, "java", "bala"));
		hs.add(new Book(203, "the life of Rajesh", "Rajesh"));
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Book b=(Book)it.next();
			System.out.println(b.bid+"::"+b.bname+"::"+b.author);
			
		}
	

	}

}
