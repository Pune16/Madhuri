//Q9C Print odd numbers from 1 to 10 using  do-while.
public class Odd3 {
    public static void main(String[] args) {
	
        System.out.println("Odd Numbers");

	int i = 1;
		
	do {
	
        if(i % 2 != 0) {
				
        System.out.println(i);
			}
	i++;
		}
	while(i <= 10);
		
	}
}

Output:
Odd Numbers
1
3
5
7
9