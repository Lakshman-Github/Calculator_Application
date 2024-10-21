import java.util.*;

class Tan_Value
{
public static void main(String[]args)
{
Scanner in = new Scanner(System.in);
double degrees = in.nextDouble();
double number = Math.toRadians(degrees);

double tanValue = Math.tan(number);

System.out.printf("Tan_Value: %.4f%n", tanValue);
}
}