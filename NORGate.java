import java.util.Scanner;
class NOR_Gate
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of a : ");
boolean a = in.nextBoolean();
System.out.println("Enter the value of b : ");
boolean b = in.nextBoolean();
boolean NOR_Value = !(a || b);
System.out.println("The Value is : "+NOR_Value);
}
}