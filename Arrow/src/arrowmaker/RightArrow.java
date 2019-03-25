package arrowmaker;

public class RightArrow extends ShapeBase {

	private int tail;
	private int width;
	
	
	public RightArrow() {
		super();
		tail = 0;
		width = 0;
	}
	
	public RightArrow(int offset, int tailSize, int theWidth) {
		super(offset);
		tail = tailSize;
		width = theWidth;
		drawHere();
	}
	
	public void set(int newHeight, int newWidth) {
		tail = newHeight;
		width = newWidth;
		drawHere();
	}
	
	// Draws the shape at the current line
	public void drawHere() {
		topArrowHead();
		ArrowTail();
		bottomArrowHead();
	}
	
	public void topArrowHead() {
		int topWidth = (width - 1) / 2;
		int arrowHeadSpaces = 0;
		
		for(int i = 0; i < topWidth; i++) {
			skipSpace(tail);
			System.out.print("*");
			if(arrowHeadSpaces <= topWidth - 1 && arrowHeadSpaces > 0) {
				for(int j = 0; j < arrowHeadSpaces; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println("");
			arrowHeadSpaces++;
		
		}
		
		
	}

	public void ArrowTail() {
		for(int i = 0; i < tail; i++) {
			System.out.print("*");
		}
		for(int j = 0; j < (width - 1) / 2; j++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
	
	public void bottomArrowHead() {
		int topWidth = (width - 1) / 2;
		int arrowHeadSpaces = topWidth - 1;
		
		for(int i = 0; i < topWidth; i++) {
			skipSpace(tail);
			System.out.print("*");
			if(arrowHeadSpaces <= topWidth - 1 && arrowHeadSpaces > 0) {
				for(int j = 0; j < arrowHeadSpaces; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.println("");
			arrowHeadSpaces--;
		
		}
		
	}
	
	private static void skipSpace(int number) {
		for(int count = 0; count < number - 1; count++) 
			System.out.print(" ");
	}
	
}
