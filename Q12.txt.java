Q12.Check if the given character is a vowel or consonant without using methods.
  Do the same program by passing the char to a static method and returning the result.

public class Alpabet {
    
    public static String vowel(char ch) {
		
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    
        return ch+" Character is vowel";
                }
        else {
                    
           return ch+" Character is consonant";
                }
    }
        
       public static void main(String[] args) {
    
           Alpabet v = new Alpabet();		
           System.out.println(v.vowel('a'));
            
                }
}


output:
  
Enter character you want to check : 
a
a Character is vowel