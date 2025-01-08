import java.util.Scanner;
public class CircleAreaCalculator 
{
    public static void main(String[] args) 
    {
	
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
	    
        double pi = 3.14;
		
        double area = pi * (radius * radius);
		
        System.out.println("Area of circle: "+area);
		
		sc.close();
    }            
}