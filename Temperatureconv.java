import java.util.*;
class Temperatureconv{
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
float ct,ft;
System.out.println("Enter the farenheit temp");
ft=sc.nextFloat();
ct=(ft-32.0f)*5/9;
System.out.println("celcius temperature is :"+ct);
}
}