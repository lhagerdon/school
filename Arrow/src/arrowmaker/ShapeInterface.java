package arrowmaker;

public interface ShapeInterface {
	// Sets the offset for the drawing
	public void setOffset(int newOffset);
		
	// Returns the offset for the drawing
	public int getOffset();
		
	// Draws the shape at lineNumber lines down from the current line
	public void drawAt(int lineNumber);
		
	// Draws the shape at the current line
	public void drawHere();
}
