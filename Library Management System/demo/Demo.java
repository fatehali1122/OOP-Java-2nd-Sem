package book;
import date.Date;
import person.Person;
public class Book{

	private String title;
	private String issn;
	private Date dop;
	private Person author;

	public Book(String title, String issn, Date dop, Person author) {
		this.title = title;
		this.issn = issn;
		this.dop = new Date(dop);
		this.author = new Person(author);
    }

   
   	public Book(Book other) {
        	this.title = other.title;
        	this.issn = other.issn;
        	this.dop = new Date(other.dop);
        	this.author = new Person(other.author);
    }

    	public void showBook() {
        	System.out.println("Book: " + title + ", ISSN: " + issn);
        	dop.showDate();
        	System.out.print("Author: ");
        	author.showPerson();
    }

    	public String getTitle(){
		return title;
}
    	public void setTitle(String title){
		this.title = title;
}
	public String getIssn(){
		return issn;
}
   	public void setIssn(String issn){
		this.issn = issn;
}
}