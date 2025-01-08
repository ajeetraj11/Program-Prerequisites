import java.util.Scanner;

public class CelsiusToFahrenheitConversion
{
    public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter tempreture in celsius: ");
		float Celsius = sc.nextFloat();
		
	    float Fahrenheit = ((Celsius * 9)/5) + 32;
		
		System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
		
		sc.close();
	}
}