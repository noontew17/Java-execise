
class test{
	
public static void main(String[] args){
	
	/*Q1*/
	String name;
	byte age;

	/*Q2*/
	name = "Noon";
	age = 30;

	/*Q3*/
	System.out.println(name);
	System.out.println(age);
	
	/*Q4*/
	System.out.println("My name is " + name );
	System.out.println("I am " + age + " years old");	
	
	
	/*Q5*/
	age = 25;
	System.out.println("My new age is " + age + " years old");		
	
	/*Q6*/
	System.out.println("The equation is : y = m * x + c");
	
	float m = 1;
	float x = 0.5F;
	float c = 15;
	float y;
	
	y = (m*x) + c;
	System.out.println("Where m is 1, x is 0.5 and c is 15");
	System.out.println("y is "+ y);
	
	/*Q7*/
	boolean isRaining = true;
	
	/*Q8*/
	boolean happy = false;
	
	/*Q9*/
	if (isRaining == true & happy == true){
		System.out.println("it is raining and we're happy ");
	}
	else if (isRaining == true & happy == false){
		System.out.println("it is raining and we're not happy ");
	}
	else if (isRaining == false & happy == true){
		System.out.println("it is raining and we're not happy ");
	}
	else if (isRaining == false & happy == false){
		System.out.println("it is raining and we're not happy ");
	}
/* 	else if (isRaining =1 and 
it is raining and we're happy 
b. it is raining and we're not happy 
c. it is not raining and we're happy 
d. it is not raining and we're not happy */
 }


}