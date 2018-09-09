import java.util.Scanner;
import java.util.*;
 class main
{

	public static void main(String args[])
	{
		System.out.println("Enter the words mam which u want to reverse:- ");
		Scanner obj = new Scanner(System.in);
		  String s1=obj.nextLine();
      char a[]=s1.toCharArray();
      System.out.println("reversed word which u want mam):-");
      for(int i=a.length-1;i>=0;i--)
      {
           System.out.print(a[i]);
      }
        
      
	}
}