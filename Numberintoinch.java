package augassign;

import java.util.Scanner;

public class Numberintoinch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number in inches:");
		double inches = input.nextDouble();
		double meter=inches*0.245;
		System.out.println("the number in meter"+meter);
		
		
		

	}

}
