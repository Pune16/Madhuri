// Q2. Add five integers (without using variables) and display their sum.


public class Sum {
    public static void main(String[] args){
        int sum =0;
        for(int i=1; i<6;i++){
            sum += i;
            System.out.println("Integers are : "+i);
        }
        System.out.println("Sum of integers : "+sum);
        
        
    }
}

Output :
Integers are : 1
Integers are : 2
Integers are : 3
Integers are : 4
Integers are : 5
Sum of integers : 15