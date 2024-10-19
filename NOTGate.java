import java.util.Scanner;
class NOT_Gate
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of a : ");
int a = in.nextInt();
int NOT_Value = (a == 0) ? 1 : 0;
System.out.println("The NOT value is : "+NOT_Value);
}
}