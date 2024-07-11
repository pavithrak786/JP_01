import java.util.*;
class Temp//cel far kelvin
{
public static void main(String[]args)   //ct=(ft-32.0f)*5/9;
{                                       //ft=(ct*9)/5+32.0f;
System.out.println("1:Celcius temp");    //kt=ct+273.03f;
System.out.println("2:Farenheit temp");  // default is not mandatory
System.out.println("3:Kelvin temp");     //we can use switch inside if                            
Scanner sc=new Scanner(System.in);
float ft=0,ct=0,kt=0;      
System.out.println("enter temp");
float temp=sc.nextFloat();
System.out.println("enter the choice");
int ch=sc.nextInt();
if(ch==1 || ch==2 ||ch==3)
{  switch(ch)
  {
   case 1:ct=temp;
             ft=(ct*9)/5+32.0f;
             kt=ct+273.03f;
             break;
  case 2:ft=temp;
         ct=(ft-32.0f)*5/9;
         kt=ct+273.03f;
         break;
 case 3: kt=temp;
         ct=kt-273.03f;
         ft=(ct*9)/5+32.0f;
         break;
 }
System.out.println("Farenheit temp is : "+ft);
System.out.println("Celcius temp is : "+ct);
System.out.println("Kelvin temp is : "+kt);


}
else
{
System.out.println("Invalid Choice");
}
}

}