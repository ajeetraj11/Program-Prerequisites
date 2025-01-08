import java.util.Scanner;

public class CylinderVolumeCalculator 
{
    public static void main(String[] args) 
    {
	
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
        int radius = sc.nextInt();
		
		System.out.print("Enter height: ");
        int height = sc.nextInt();
		
	    
        double pi = 3.14;
        double volume = pi * (radius * radius) * height;
		
        System.out.println("Volume of Cylinder "+ volume);
		
		sc.close();
    }            
}