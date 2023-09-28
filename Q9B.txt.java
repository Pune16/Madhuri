//Q9B Print odd numbers from 1 to 10 using  while.
public class Odd2 {
    public static void main(String[] args) {
		
        System.out.println("Odd Numbers");

   int i = 1;
       
   while(i <= 10) {
           
   if(i % 2 != 0) {
               
       System.out.println(i);
           }
   i++;
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
