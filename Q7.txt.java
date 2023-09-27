import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

	int num1 = 4;
	int num2 = 2;
		
	System.out.println("Enter the Operators to perform Operations : ");
	Scanner sc = new Scanner(System.in);
	char sum = sc.next().charAt(0);
		
	switch(sum) {
		
		case '+':
			System.out.println("Sum of "+num1+" + "+num2+" is : "+(num1 + num2));
			break;
			
		case '-':
			System.out.println("Difference of "+num1+" - "+num2+" is : "+(num1 - num2));
		    break;
			
		case '*':
			System.out.println("Product of "+num1+" * "+num2+" is : "+(num1 * num2));
			break;
			
		case '/':
			System.out.println("Quotient of "+num1+" / "+num2+" is : "+(num1 / num2));
			break;
			
                default:
	    	System.out.println("Invalid Operation");
			
		}
	}
}


Output:

Enter the Operators to perform Operations : 
+
Sum of 4 + 2 is : 6