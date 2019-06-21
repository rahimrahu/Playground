import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int num = in.nextInt();
     int first = num /100;
      int thrid = num%10;
      int sum = first + thrid;
      
      System.out.println(sum);
	}
}