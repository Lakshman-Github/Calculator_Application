import java.util.*;

class Cosec_Value
{
public static void main(String[]args)
{
Scanner in = new Scanner(System.in);
double degrees = in.nextDouble();

double number = Math.toRadians(degrees);
double sinValue = Math.sin(number);

double CosecValue = (sinValue!=0)?1 / sinValue: Double.POSITIVE_INFINITY;

System.out.printf("Cosec_Value: %.4f%n", CosecValue);
}
}