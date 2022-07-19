import java.util.Scanner;  

class Pens{
	
	String penName;
	String penColour;
	double penPrice;

}

class PensList{

	public static void main(String[] args){
		
		// Step 1.2
		Pens p1 = new Pens();
		Pens p2 = new Pens();
		int index = 1;
		
		Scanner sc = new Scanner(System.in);
		Pens[] pens = {p1, p2};
		
		
		
		for (Pens p: pens){
		System.out.println("Pen" + index);
		System.out.println("Enter pen name: ");
		p.penName= sc.nextLine();
		System.out.prinlnt("Enter pen colour: ");
		p.penColour= sc.nextLine();
		System.out.println("Enter pen price: ");
		p.penPrice= sc.nextDouble();
		index++;
		}
		
		index = 1;
		for (Pens p: pens){
			System.out.println("Pen" + index);
			System.out.println(p.penName);
			System.out.println(p.penColour);
			System.out.println(p.penPrice);
			index++;
		}
		
	}
}