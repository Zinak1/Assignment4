/*
 * @author Zeliha Inak
 */
public class Property {
//fields
	private String propertyName;
	private String city;
	private String owner;
	private double rentAmount; 
	private Plot plot;
	/**
	 * This constructor create a Plot object with no parameter empty constructor
	 * No-arg Constructor, creates a new object with default values of empty strings
	 */
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.rentAmount = 0;
		this.plot = new Plot();
	}
	/*
	 * This is copy constructor, create a new object using the 
	 * information of the object passed to it.
	 * @param p
	 */
	public Property (Property p)
	{
		this.propertyName = p.propertyName;
		this.city = p.city;
		this.owner = p.owner;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot (p.plot);
	}
	/*
	 * This constructor create a Plot object with below parameters
	 * @param propertyName
	 * @param city 
	 * @param rentAmount 
	 * @param owner
	 */
	public Property (String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount; 
		this.plot = new Plot();
	}
	/*
	 * This constructor with below parameters create new Plot 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property (String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot (x,y,width, depth);
	}
	/*
	 * Gets propertyName
	 * @return propertyName
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	/** 
	 * Sets propertyName
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	/*
	 * Gets city 
	 * @return city
	 */
	public String getCity()
	{
		return city;
	}
	/*
	 * sets city
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city; 
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
     * Gets rentAmount
     * @return rentAmount
     */
	public double getRentAmount() {
		return rentAmount;
	}

    /**
     * Sets rentAmount
     * @param rentAmount
     */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	/**
     * Gets getPlot
     * @return plot
     */
	public Plot getPlot() {
		return plot;
	}
	/**
     * Sets plot values and returns plot values
     * @param x
     * @param y
     * @param width
     */
    public Plot setPlot(int x, int y, int width, int depth)
    {
        return new Plot(x, y, width, depth);
	}
    /*
     * To String 
     * @return string
     */
    public String toString()
    {
    	return "\n Property Name: " + propertyName +
    			"\n Located in city: " + city +
    			"\n Belonging to: " + owner +
    			"\n Rent Amount: " + rentAmount;
    			
    }
	
}
