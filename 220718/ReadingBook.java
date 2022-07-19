class Books{
	
	// Step 1.1
	String bookName;
	String authorName;
	double bookPrice;

}

class ReadingBook{

	public static void main(String[] args){
		
		// Step 1.2
		Books b1 = new Books();
		Books b2 = new Books();
		Books b3 = new Books();
		
		b1.bookName = "Eat";
		b1.authorName ="Jinx";
		b1.bookPrice = 3.3;
		
		b2.bookName = "Sleep";
		b2.authorName ="Miro";
		b2.bookPrice = 5;
		
		b3.bookName = "play";
		b3.authorName ="Herse";
		b3.bookPrice = 7.8;
		
		System.out.println(b1.bookName);
		System.out.println(b1.authorName);
		System.out.println(b1.bookPrice);

		System.out.println(b2.bookName);
		System.out.println(b2.authorName);
		System.out.println(b2.bookPrice);
		
		System.out.println(b3.bookName);
		System.out.println(b3.authorName);
		System.out.println(b3.bookPrice);
		System.out.println("================");
		// Step 1.3
		
		Books [] books = {b1, b2, b3};
		int index = 0;
		while (index<3){
			System.out.println(books[index].bookName);
			System.out.println(books[index].authorName);
			System.out.println(books[index].bookPrice);
			index++;
		}
		System.out.println("================");
		// Step 1.4
		for (Books b: books){
			System.out.println(b.bookName);
			System.out.println(b.authorName);
			System.out.println(b.bookPrice);
		}
		
		
		
		
	
	
	
	
	
	}
}