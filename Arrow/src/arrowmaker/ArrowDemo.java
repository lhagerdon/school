package arrowmaker;

import java.util.*;

public class ArrowDemo {

	public static RightArrow right = new RightArrow();
	public static LeftArrow left = new LeftArrow();
	public static boolean playAgain = true;
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(playAgain) {
			whichArrow();
			playAgain = false;
			
		}

	}
	
	public static void whichArrow() {
		System.out.println("Please enter 1 if you would like a left arrow, or two if you would like a right arrow\n1. Left Arrow\n2. Right Arrow");
		
		try {
			int user = input.nextInt();
			
			if(user == 2) {
				rightArrow();
			} else if(user == 1) {
				leftArrow();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
	public static void rightArrow() {
		int tail, arrowhead;
		
		System.out.print("Please enter the length of the tail: ");
		tail = input.nextInt();
		
		System.out.print("Please enter the height of the arrow head (Please enter an odd number): ");
		arrowhead = input.nextInt();
		
		right.set(tail, arrowhead);
	}
	
	public static void leftArrow() {
		int tail, arrowhead;
		
		System.out.print("Please enter the length of the tail: ");
		tail = input.nextInt();
		
		System.out.print("Please enter the height of the arrow head (Please enter an odd number): ");
		arrowhead = input.nextInt();
		
		left.set(tail, arrowhead);
	}
}
