import java.util.*;

class Condition{
	public static void main(String[] args){

		// Q5
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number");
		int a= sc.nextInt();
		
		if (1<=a & a<= 5){
			System.out.println("Weekday");  
		}
		else if (6<=a & a<= 7){
			System.out.println("Weekend"); 
		}
		else{
			System.out.println("Error"); 
		}
		
		System.out.println("===========================");
		//Q6
		
		switch (a){
			case 1:
				System.out.println("Weekday");
				break;
			case 2:
				System.out.println("Weekday");
				break;
			case 3:
				System.out.println("Weekday");
				break;
			case 4:
				System.out.println("Weekday");
				break;
			case 5:
				System.out.println("Weekday");
				break;
			case 6:
				System.out.println("Weekend");
				break;
			case 7:
				System.out.println("Weekend");
				break;			
				
		}
		
		System.out.println("===========================");		
		
		// Q7
		int i ;		
		for (i=1; i<=7; i++){
			if (1<=i & i<= 5){
			System.out.println("Weekday");  
		}
		else{
			System.out.println("Weekend"); 
		}
		}
	}
}