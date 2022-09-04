package com.oops.bll;

public class Author {
	
	public String FirstName;
	public String LastName ;
	public String BookName ;
	
	public Author() {
		
	}
	
	public Author (String FirstName, String LastName ) {
		this.FirstName = FirstName ;
		this.LastName  = LastName  ;
		
	}
	public Author (String FirstName, String LastName, String BookName) {
		this.FirstName = FirstName ;
		this.LastName  = LastName  ;
		this.BookName  = BookName  ;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName ;
	}
	public String getBookName() {
		return BookName;
	}
	public void setbookName(String BookName) {
		this.BookName = BookName;
	}
@Override 
public String toString() {
	return "Author FirstName : "+FirstName+ "\nAuthor LastName :" +LastName+ "\nBookName : "+ BookName;
}
}
	
		


