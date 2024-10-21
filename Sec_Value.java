import java.util.*;

class Sec_Value
{
public static void main(String[]args)
{
Scanner in = new Scanner(System.in);
double degrees = in.nextDouble();

double number = Math.toRadians(degrees);
double cosValue = Math.cos(number);

double secValue = (cosValue!=0)?1 / cosValue: Double.POSITIVE_INFINITY;

System.out.printf("Sec_Value: %.4f%n", secValue);
}
}