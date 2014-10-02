class Poly {

	public static void main(String[] args) {

// declare variables
	
	int a = 0;
	int b = 0;
	int c = 0;
	
// ask user to input 
	
	System.out.println("Enter the first root:");
	a = IO.readInt();
	
	System.out.println("Enter the second root:");
	b = IO.readInt();
	
	System.out.println("Enter the third root:");
	c = IO.readInt();
	
        
        
        
	
//error check 

/* 
________________
________________
________________
*/



//Calculations 




//Outputs

System.out.println("The polynomial is: "+"x^3 + " + (-(a + b + c)) + "x^2 + " + (a * b + c * a + c * b) + "x + " + (-(c * a * b)));

}
}



