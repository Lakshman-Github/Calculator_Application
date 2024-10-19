import java.util.Scanner;
class NAND_Gate
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the value of a : ");
boolean a = in.nextBoolean();
System.out.println("Enter the value of b : ");
boolean b = in.nextBoolean();
boolean NAND_Value = !(a && b);
System.out.println("The Value is : "+NAND_Value);
}
}