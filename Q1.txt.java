//Q1.Print your name, hobbies and favorite movie name.
import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String Name = sc.nextLine();
        System.out.println("Enter the Hobbies:");
        String Hobbies = sc.nextLine();
        System.out.println("Enter the favorite Movie Name:");
        String Movie = sc.nextLine();
        System.out.println(" Name: "+Name);
        System.out.println("Hobbies :"+Hobbies);
        System.out.println("Favorite Movie :"+Movie);

    }
}


Output :

       Enter the name:
        Madhuri Shendge                                                          
        Enter the Hobbies:                                                       
       Dancing,Listening Music
      Enter the favorite Movie Name:
      Name: Madhuri Shendge 
      Hobbies :Dancing,Listening Music
      Favorite Movie :Genius