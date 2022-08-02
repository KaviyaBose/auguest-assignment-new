package augassign;

import java.util.Scanner;

public class Minutes {

	public static void main(String[] args) {
		double minutesinyear=60*24*365;
		Scanner input=new Scanner(System.in);
		System.out.print("Input the number of minutes:");
		// TODO Auto-generated method stub
		double min=input.nextDouble();
		long years=(long)(min/minutesinyear);
		int days=(int)(min/60/24)%365;
		System.out.println((int)min+"minutes is approximately"+years+"years and"+days+"days");

	}

}
