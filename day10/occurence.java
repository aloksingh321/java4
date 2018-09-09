import java.util.Scanner;
class main
{
	public static void main(String args[])
	{
	Scanner obj= new Scanner(System.in);
	 System.out.println("Enter the String mam):-");
	String s1= obj.nextLine();
	int i,j;
	 for(i=0;i<s1.length();i++)
	 {
	 for(j=i+1;j<=s1.length();j++)
	 {
	  System.out.println(s1.substring(i,j));
	 }
	 }      
	}
}