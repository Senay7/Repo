

//AUthor: Senay Alemayehu


public class Property {

	private String name;
	private String city;
	private double rentalAmount;
	private String owner;
	private Plot plot=new Plot();
	
	
	//Initializes all values 
	public Property() {
		
		
		name="";
		city="";
		rentalAmount=0;
		owner="";
		plot=new Plot(0,0,1,1);
		
		
	}
	
	//constructor
	public Property(String propertyName1, String city1, double rentAmount1, String owner1) {
		this.name=propertyName1;
		this.city=city1;
		this.rentalAmount=rentAmount1;
		this.owner=owner1;
		this.plot=new Plot(0,0,1,1);
		
	}
	
	
	
	//Copy constructor
	public Property (Property m) {
	
		this.name=m.name;
		this.city=m.city;
		this.rentalAmount=m.rentalAmount;
		this.owner=m.owner;
		
		this.plot=new Plot (m.getPlot());
		
	}
	
	public Property(int x, int y, int width, int depth) {
		this.name="";
		this.city="";
		this.rentalAmount=0;
		this.owner="";		
		this.plot=new Plot(x,y,width,depth);
		
		
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		
		
		
		
		
		setPropertyName(propertyName);
		setCity(city);
		setRentAmount(rentAmount);;
		setOwner(owner);
		
		setPlot(x,y,width,depth);
	}
	
	
	public Property getProperty() {
		return this.getProperty();
		
	}
	
	
	public String getPropertyName() {
		return this.name;
		
	}
	
	public void setPropertyName(String propertyName1) {
		
		this.name=propertyName1;
	}
	
	
	
	
	public void setCity(String city1) {
		
		this.city=city1;
		
	}
	public String getCity() {
		
		return this.city;
		
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
		
		return plot;
		
		
		
	}
	public Plot getPlot() {
		
		return plot;
	}
	
	
	
	
	public double getrentAmount() {
		
		return this.rentalAmount;
		
	}
	
	public void setRentAmount(double price) {
		this.rentalAmount=price;
		
	}
	
	public String getOwner() {
		
		return this.owner;
		
	}
	
	public void setOwner(String name) {
		
		owner=name;
	}
	
	
	public String toString() {
		
		return ("Property Name : "+ name + "\n Located in "+ city+"\n Belonging to :"+ owner+"\nRent Amount: "+rentalAmount);
		
		
	}
	
	
	
	
	
	
	
}
