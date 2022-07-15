

class Control{
	public static void main(String[] args){
		
		// Q1
		int n = 0;
		int n2 = 0;
		
		while (n < 10){
			n2 =n + 10;
			System.out.println(n +" "+ n2);
			n++;
		}
			
		System.out.println("===========================");
		
		//Q2
		n = 0;
		n2 = 1;
		
		while (n<10){
			n2 *= 2;
			System.out.println(n +" "+ n2);
			n++;

		} 
		  
		System.out.println("===========================");		  
		// Q3
		
		for (n = 0; n < 10; n++) {
			n2 = n+10;
			System.out.println(n +" "+ n2);
		}
			
		System.out.println("===========================");
		


		for (n= 0, n2 =1; n < 10; n++) {
			n2 *= 2;
			System.out.println(n +" "+ n2);
		}
		
		
		
	}
	
}

// Prefer for loop, specified range, more accuracy, less infinite loops
