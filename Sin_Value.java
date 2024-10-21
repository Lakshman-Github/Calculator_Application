import java.util.*;

class Sin_Value
{
public static void main(String[]args)
{
Scanner in = new Scanner(System.in);
double degrees = in.nextDouble();
double number = Math.toRadians(degrees);

double sinValue = Math.sin(number);

System.out.printf("Sin_Value: %.4f%n", sinValue);
}
}