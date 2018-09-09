import java.util.Scanner;
import java.util.*;
class Main {
 
public static void main(String[] args) 
{
    
Scanner obj= new Scanner(System.in);
System.out.println("Enter the String mam ):- ");
  String s1=obj.nextLine();
  String s2=obj.nextLine();
   char a[]=s1.toCharArray();
   char b[]=s2.toCharArray();
   int flag=0,i,j=0;
  for(i=0;i<a.length && j<b.length;i++)
  {
    if(a[i]==b[j])
    {
      flag=1;
    }
    else
    {
       flag=0;
      break;
     
    }
    j++;
  }
 if(flag==1)
 {
   System.out.println("yes occurence of the String");
 }
else
{
  System.out.println("No occurence of the String");
}



}
}