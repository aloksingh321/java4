import java.util.Scanner;
import java.util.*;
class Main {
 public static int sub(String s)
 {
   int count=1;
   for(int i=0;i<s.length()-1;i++)
   {
    if(s.charAt(i) == ' '&& s.charAt(i+1)!=' ')
    {
      count++;
    } 
   }
   return count;
 } 
public static void main(String[] args) 
{
    
Scanner obj= new Scanner(System.in);
System.out.println("Enter the String mam:- ");
String s1=obj.nextLine();
int  f1=sub(s1);
System.out.print(f1);


}
}