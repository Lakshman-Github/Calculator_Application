import java.util.*;

class Cos_Value
{
public static void main(String[]args)
{
Scanner in = new Scanner(System.in);
double degrees = in.nextDouble();
double number = Math.toRadians(degrees);

double cosValue = Math.cos(number);

System.out.printf("Cos_Value: %.4f%n", cosValue);
}
}