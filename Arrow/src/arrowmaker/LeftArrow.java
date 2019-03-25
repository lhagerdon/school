package arrowmaker;

public class LeftArrow extends ShapeBase{
	private int tail;
	private int width;
	
	
	public LeftArrow() {
		super();
		tail = 0;
		width = 0;
	}
	
	public LeftArrow(int offset, int tailSize, int theWidth) {
		super(offset);
		tail = tailSize;
		width = theWidth;
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
		int arrowHeadSpaces = topWidth - 1;
		
		for(int i = 0; i < topWidth; i++) {
			skipSpace(topWidth);
			if(arrowHeadSpaces <= topWidth - 1 && arrowHeadSpaces > 0) {
				for(int j = 0; j < arrowHeadSpaces; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			
			System.out.print("*");
			
			System.out.println("");
			arrowHeadSpaces--;
		
		}
	}
	
	public void ArrowTail() {
		
	}
	
	public void bottomArrowHead() {
		
	}
	
	private static void skipSpace(int number) {
		for(int count = 0; count < number; count++) 
			System.out.print(" ");
	}
}
