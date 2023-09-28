//Q9A. Print odd numbers from 1 to 10 using for.
public class Odd1 {
    public static void main(String[] args) {
		
        System.out.println("Odd Numbers");
            
            for(int i = 1; i <= 10; i++) {
                
            if(i % 2 != 0) {
                    
            System.out.println(i);
                }
            }
        }
}

Output:
 Odd Numbers
1
3
5
7
9