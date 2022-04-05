/*
 * @author Zeliha Inak
 */
public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	/*
	 * No-arg Constructor, creates a default Plot with args x=0, y=0, width=1, depth=1
	 */
	public Plot()
	{
		this.x=0;
		this.y=0;
		this.width=1;
		this.depth=1;
	}
	/*
	 * This a copy constructor. it creates new object
	 * using the information of the object passed to it.
	 */
	public Plot(Plot p)
	{
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	/*
	 * This constructor has parameters
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Plot (int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	/*
	 * This ethod calcylate if there is any overlaps or not 
	 * @param plot
	 * @return true if there is overlaps otherwise false
	 */
	public boolean overlaps (Plot plot)
	{
		boolean isOverLap = x <plot.x + plot.width && x + width > plot.x && y  < plot.y + plot.depth && y + depth > plot.y;
		return isOverLap;
	}
	/**
     * encompasses that takes a Plot instance and determines if the current plot contains it.
     * @param plot
     * @return true if plot encompasses the parameter. otherwise false
     */

	public boolean encompasses (Plot plot)
	{
		boolean encompass =  false; 
		double rightX = x + width;
        double bottomY = y + depth;
        double newRightX = plot.getX()+plot.getWidth();
        double newBottomY = plot.getY() + plot.getDepth();
        if (
            this.x<=plot.getX() && plot.getX()<=rightX &&
            this.y<=plot.getY() && plot.getY()<=bottomY &&
            this.x<=rightX && newRightX<=rightX &&
            this.y<=newBottomY && newBottomY<=bottomY)
        {
            encompass = true;
        }
        return encompass;
    }
	/**
     * To String
     * @return string
     */
	public String toString()
	{
		return "Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
}
