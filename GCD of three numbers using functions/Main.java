import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = gcd_of_2_numbers(n1, n2);
	    System.out.print(gcd_of_2_numbers(n1, n2));
	}
public static int gcd_of_2_numbers(int num1, int num2)
	{
	    int min_ele;
	    if(num1 < num2)
	    {
	        min_ele = num1;
	    }
	    else{
	        min_ele = num2;
	    }
	    while(min_ele >= 1)
	    {
	        if((num1 % min_ele == 0) &&(num2 % min_ele == 0))
	        {
	            return min_ele;
	        }
	        --min_ele;
	    }
	    return 0;
	}
}