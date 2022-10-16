import java.io.*;
import java.util.*;
class Main1 {
	public static void main (String[] args) {
		System.out.println("Celcius value is = ");
		Scanner sc=new Scanner(System.in);
		ConvertCelsiusToFahrenheit obj=new ConvertCelsiusToFahrenheit();  
		int C;
		C=sc.nextInt();//input temperature in celscius
		System.out.println("Fahrenheit value is = "+(int)(obj.cToF(C)));//print the output
		
	}
}


public class ConvertCelsiusToFahrenheit {
	public double cToF(int C)
    {
        return (C*9)/5 + 32;
    }
}
