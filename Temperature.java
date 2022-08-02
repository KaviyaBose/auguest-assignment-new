package augassign;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		float temp;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature: ");
		temp=sc.nextFloat();
		temp=((temp-32)*5)/9;
		System.out.println("celsium temp is"+temp);

	}

}
