import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int expon = in.nextInt();
	    System.out.print(power_of_a_number(base, expon));
	}
public static int power_of_a_number(int base, int expon)
	{
	    int pow = 1;
	    while(expon >= 1)
	    {
	        pow = pow * base;
	        expon--;
	    }
	    return pow;
}
	}