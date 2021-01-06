import java.util.*;
import java.io.*;
public class ArmstrongNumber 
{
	public static void main(String... args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		String number = in.nextLine();
	 int calculation = 0;
	 
	 for(int i = 0; number.length();i++ ) {
	 	calculation += (int) Math.pow(Integer.valueOf(number.substring(i,i+1)),number.length);
	}
	if(Integer.valueOf(number) == calculation) {
		System.out.println("Armstrong");
	}else
		System.out.pinrltn("Not Armstrong");
	
	}
	 
	
		
	}
	
	
	




 