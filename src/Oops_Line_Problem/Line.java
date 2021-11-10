package Oops_Line_Problem;

import java.util.Scanner;

public class Line {
	double x1, x2, x3, x4;
	double y1, y2, y3, y4;
	double length1;
	
	public double equals() {
		
		double length2 = Math.sqrt( Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		
		if (length1 == length2) {
			System.out.println(" The two lines are equal ");
		}
		else {
			System.out.println(" The two lines are not equal");
		}
		
		return length2;
	}
	
	public void compareTo (double length1, double length2) {
		
		if (length1 == length2) {
			System.out.println("\n both lines are equal in length");
		}
		
		else if (length1 > length2) {
			System.out.println("\n  1st line is greater than the 2nd. ");
		}
		
		else {
			System.out.println("\n  2nd line is greater than the 1st. ");
		}
	}
	
	public void calculateLength() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter x1: ");
		x1 = input .nextDouble();
		
		System.out.print(" Enter y1: ");
		y1 = input .nextDouble();
		
		System.out.print(" Enter x2: ");
		x2 = input .nextDouble();
		
		System.out.print(" Enter y2: ");
		y2 = input .nextDouble();
		
		System.out.print(" Enter x3: ");
		this.x3 = input .nextDouble();
		
		System.out.print(" Enter y3: ");
		this.y3 =input .nextDouble();
		
		System.out.print(" Enter x4: ");
		this.x4 = input.nextDouble();
		
		System.out.print(" Enter y4: ");
		this.y4 = input.nextDouble();
		
		length1 = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("\n 1st point is : (" + x1 + ", " + y1 + ")");
		System.out.println(" The 2nd point is : (" + x2 + ", " + y2 + ")");		
		
		System.out.println(" The 3rd point is : (" + this.x3 + ", " + this.y3 + ")");
		System.out.println(" The 4th point is : (" + this.x4 + ", " + this.y4 + ")\n");
		
		
		
		
		double length2 = equals();
		System.out.println(" The length of the 1st line is : " + length1);
		System.out.println(" The length of the 2nd line is: " + length2);
		
		compareTo(length1, length2);		
		input.close();
		
	}
}
