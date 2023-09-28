//Q11.Area and perimeter of rectangle – once without using methods and once using static methods for area & perimeter.
public class Perimeter {
    public static int area(int length, int breadth) {
		
        return length * breadth;
    }
        
        public static int perimeter(int length, int breadth) {
            
        return 2 * length + breadth;
    }
    
        public static void main(String[] args) {
    
        Perimeter a = new Perimeter();
            
        System.out.println("Area of rectangle using static method is : "+a.area(4, 8));
            
        System.out.println("Perimeter of rectangle using static method is : "+a.perimeter(4, 8));
            
        }
}

output:
Area of rectangle using static method is : 32
Perimeter of rectangle using static method is : 16