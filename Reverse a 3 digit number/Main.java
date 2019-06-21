import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); 
    int first_di = n/100;
    int second_di = ((n/10)%10);
    int last_di = n%10;
  int reverse = (last_di*100+second_di*10 +first_di);
    System.out.println(reverse);
  }
}
  
