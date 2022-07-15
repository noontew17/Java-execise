class Year{
	public static void main(String[] args){
		
		int year;
		
		for (year = 1900; year<=2022; year++){
			if (year%4 == 0 & year%100 != 100 || year%400 ==0 ){
			System.out.println(year);
			
		}
		} 
	}
}