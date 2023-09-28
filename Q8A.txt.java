Q8A  Print even numbers from 1 to 10 using for loop.


public class Even{
    public static void main(String[] args) {

        System.out.println("Even Numbers");

	for(int i = 1; i <= 10; i++) {
			
	if(i % 2 == 0) {
				
	System.out.println(i);
			}
		}
	}
}


Output:
Even Numbers
2
4
6
8
10