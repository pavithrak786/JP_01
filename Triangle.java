import java.util.*;
class Triangle
{
public static void main(String[]args )
{ Scanner sc=new Scanner(System.in);
  System.out.println("enter the a b and c values");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
  if(a==b && b==c && a==c)
   {
    System.out.println("Equilateral triangle");
   }
   else if(a==b || a==c || b==c )
   {
    System.out.println("Isosceles Triangle");
   }
  else{
  System.out.println("Scalen Traingle");
  }




}
}