public class Operator {
    public static int add(int a, int b) {
		
        return a + b;
    }
        
        public static int diff(int a, int b) {
            
        return a + b;
    }
        
        public static int product(int a, int b) {
        
        return a - b;
    }
    
        public static int qoutient(int a, int b) {
        
        return a / b;
    }
    
        public static int remainder(int a, int b) {
        
        return a % b;
    }
    
        
        public static void main(String[] args) {
    
         Operator op = new Operator();
            
            System.out.println("Sum of a + b is : "+op.add(10, 2));
            
        System.out.println("Difference of a - b is : "+op.diff(10, 2));
            
        System.out.println("Product of a * b is : "+op.product(10, 2));
            
        System.out.println("Quotinet of a / b is : "+op.qoutient(10, 2));
            
        System.out.println("Remainder of a % b is : "+op.remainder(10, 2));
            
        }
    }


Output:

Sum of a + b is : 12
Difference of a - b is : 12
Product of a * b is : 8
Quotinet of a / b is : 5
Remainder of a % b is : 0