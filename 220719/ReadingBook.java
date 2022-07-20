class Books{
	
	// Step 1.1
	private String bookName;
	private String author;
	private double bookPrice;
	
	// Steps 1.2 - constructor
	public Books(String bookName, String author, double bookPrice){
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	
	// Step 1.3 Setter & Getter
	// Setter
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}

	public void setBookPrice(double bookPrice){
		this.bookPrice = bookPrice;
	}
	
	// Getter
	public String getBookName(){
		return this.bookName;
	}

	public String getAuthor(){
		return this.author;
	}
	
	public double getBookPrice(){
		return this.bookPrice;
	}
	
	// Step 1.4 getBookDetails
	 public  String getBookDetails(){
  
        return this.bookName + this.author + this.bookPrice;
    }
/* 	public String getBookDetails(){
		
		getBookName();
		getAuthor();
		getBookPrice();
		
 		return {this.bookName, this.author, this.bookPrice}; 
	} */
}

class ReadingBook{

	public static void main(String[] args){
		
		// Step 1.5
		Books b1 = new Books("Rage", "Ragis", 20);
		Books b2 = new Books("Code", "Thoms", 15);
		Books b3 = new Books("Witches", "Lee", 10);
		

		System.out.println(b1.getBookName());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getBookPrice());

		System.out.println(b2.getBookName());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getBookPrice());
		
		System.out.println(b3.getBookName());
		System.out.println(b3.getAuthor());
		System.out.println(b3.getBookPrice());
		System.out.println("================");
		// Step 1.6
		
		Books [] books = {b1, b2, b3};
		int index = 0;
		while (index<3){
			System.out.println(books[index].getBookName());
			System.out.println(books[index].getAuthor());
			System.out.println(books[index].getBookPrice());
			index++;
		}
		System.out.println("================");
		
		
		for (Books b: books){
			System.out.println(b.getBookName());
			System.out.println(b.getAuthor());
			System.out.println(b.getBookPrice());
		}
		
		System.out.println("================");
		
		
		for (Books b: books){
			System.out.println(b.getBookDetails());
		}
		
		
	
	
	
	
	
	}
}