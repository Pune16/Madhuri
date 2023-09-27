// Q6.Print "PASS" if the int variable "mark" is more than or equal to 50; or prints "FAIL" otherwise.

import java.util.Scanner;

public class Marks {
    public static void main(String args){
        int  marks;
		
	System.out.println("Enter marks to check :");
	Scanner sc = new Scanner(System.in);
	marks = sc.nextInt();
		
	if(marks >= 50) {
			
	System.out.println("Pass");
		}
	else {
	System.out.println("Fail");
		}
        
    }
    
}


Output : 

 Enter marks to check :
100
Pass