//Q15  Java program to initialize int array, string array and character array

public class Array {
    public static void main(String[] args) {
		
        int[] n = {1,2,3,4,5};
        String[] str = {"kunal"};
        char[] c = {'k','u','n','a','l'};
            
        System.out.println("Integer Array Initialization : ");
        for(int n1 : n) {
                
        System.out.println(n1);
            }
            
        System.out.println("String Array Initialization : ");
            
        for(String str1 : str) {
                
        System.out.println(str1);
            }
            
        System.out.println("String Array Initialization : ");
            
        for(int i = 0; i<c.length; i++) {
                
        System.out.println(c[i]);
            }
        }
}


output :-
         Integer Array Initialization : 
1
2
3
4
5
         String Array Initialization : 
Madhuri
         Character Array Initialization : 
M
a
d
h
u
r
i