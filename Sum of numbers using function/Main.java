import java.util.Scanner;
class Main{
	public static void main (String[] args){
  Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(sum_of(n));
	}
public static int sum_of(int a)
	{
	    int sum = 0;
	    for(int i = 1; i<= a; i++)
	    {
	        sum = sum + i;
	    }
	    return sum;
	}
} 