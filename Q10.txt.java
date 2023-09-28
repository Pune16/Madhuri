//Q 10  Find area and circumference of a circle, given its radius.  Do this once without using methods and once using static methods for area & circumference 
public class Area {
    public static void main(String[] args) {
		
        double area, circumference;
        double radius = 6;
        double PI = 3.14;
            
        area = 3.14 * radius * radius;
            
        circumference = 2 * 3.14 * radius;
            
        System.out.println("Area of circle without using methods is : "+area);
            
        System.out.println("Circumference of circle without using methods is : "+circumference);
            
        }   
}


output:
Area of circle without using methods is : 113.03999999999999
Circumference of circle without using methods is : 37.68