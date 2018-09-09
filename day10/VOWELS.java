import java.util.Scanner;
import java.util.*;
class Main {
 public static int  check(char a)
{
  switch(a) {
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
      return 1;
    default:
      return 0;
  }
}
public static void main(String[] args) 
{
  
Scanner obj= new Scanner(System.in);
String s1=obj.nextLine();
 char []a=s1.toCharArray();
 int n=a.length;
 int i,j=0;
 char []b= new char[n];
 
 for( i=0;i<n;i++)
 {
   if(check(a[i])==0)
  {
    b[j]=a[i];
  j++;
  }
  
 }
 
for(i=0;i<n;i++)
{
  System.out.println(b[i]);
}
}
}