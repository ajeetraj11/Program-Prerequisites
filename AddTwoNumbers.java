import java.util.*;

public class AddTwoNumbers
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter first number: ");
	  int num1 = sc.nextInt();
	  
	  System.out.print("Enter second number: ");
	  int num2 = sc.nextInt();
	  
	  System.out.println("The Sum Of Two Numbers Are : " + (num1+num2) );
	  
	  sc.close();
   }
}