//Q8C Print even numbers from 1 to 10 using do-while loop.


public class Even2{
     public static void main(String[] args) {
		
        System.out.println("Even Numbers");

        int i = 1;
		
	do {
			
	if(i % 2 == 0) {
			
        System.out.println(i);
		}
	i++;
	     }
		
	while(i <= 10);
	}
}

Output:
Even Numbers
2
4
6
8
10