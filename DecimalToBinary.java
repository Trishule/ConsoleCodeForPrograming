package challenges;

import java.util.*;

public class DecimalToBinary
{
	public static void main(String... args){
		System.out.println("Decimal To Binary Converter");
		Scanner in = new Scanner(System.in);
		System.out.println("Decimal Number :");
		long input = in.nextInt();
		var decimalToBinary = new ArrayList<Long>();
		var decimalToBinaryRemeinders = new ArrayList<Long>();
		long quotient = input/2;
		long remeinder = input%2;
		long tempquotient;
		long tempreminder;
		decimalToBinary.add(quotient);
		decimalToBinaryRemeinders.add(remeinder);
		
		while(quotient != 0){
			tempquotient = quotient/2;
			tempreminder = quotient%2;
			decimalToBinary.add(tempquotient);
			decimalToBinaryRemeinders.add(tempreminder);
			quotient = tempquotient;
			remeinder = tempreminder;
		}
		System.out.println("Thinking.....");
		for(int i = decimalToBinaryremeinders.size()-1;i >= 0; i--);
			System.out.print(decimalToBinaryRemeinders.get(i));
		
		
		
		
		
	}
}
