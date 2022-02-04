/*
*   
*   <<<< Nag >>>>
*
*/
import java.util.*;
class Palindrome 
{
    public static void main(String[] args) 
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string: ");
      String s = sc.nextLine();   
      String rev="";
      for(int i=s.length()-1;i>=0;i--)
      {
          rev+=s.charAt(i);
      }
      System.out.println(rev);  //-->This line prints the reversed String in new line.
      if(rev.equalsIgnoreCase(s))
          System.out.println("Palindrome");
      else
          System.out.println("Not a Palindrome");
      sc.close();
    }
}
// -----> Inside For loop the String input gets reversed and the each character will be added to the new String (rev).
// -----> After that we compare the both new And old Strings.
