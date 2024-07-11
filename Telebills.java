import java.util.*;
class  Telebills
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the msgs");
int msg=sc.nextInt();
float amt=0;
if (msg<=80)
{
amt=250f;
}
else if(msg>80 && msg<=140)
{
amt=250+(msg-80)*0.60f;

}
else if(msg>140 && msg<=200)
{
amt=286+(msg-140)*0.50f;

}
else
{


amt=316+(msg-200)*0.40f;

}

System.out.println(amt);

}

}