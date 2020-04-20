

public class Plot {

	
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x=0;
		this.y=0;
		this.width=1;
		this.depth=1;
		
		
	
	}
	
	
	//Object constructor
	public Plot(Plot p) {
		x=p.x;
		y=p.y;
		width=p.width;
		depth=p.depth;
		
	}
	
	public Plot(int x, int y, int width, int depth) {
		
		this.x=x;
		this.y=y;
		this.width=width;
		this.depth=depth;
		
	}
	

	
	
	public boolean overlaps (Plot other) {
		boolean overlaps=false;;
		
		
		//coordinates for first rec
		int x1= x;
		int y1=y;
		//Bottom left coordinates
		
		//Top right coordinates
		int x2=x+width;
		int y2=y+depth;
		
		
		
		
		//Bottom left, second rectangle coordinates
		int otherx1=other.getX();
		int othery1=other.getY();
		
		//Top right, second rectangle coordinates
		int otherx2=other.getX()+other.getWidth();
		int othery2=other.getY()+other.getDepth();
		
		
		
		if ((otherx1>x2)||(othery1>y2)||(x1>otherx2)||(y1>othery2)) 
		{
			overlaps=false;
			
		}
		else {
			
			overlaps= true;
		}
		
	
		return overlaps;
		
		
		
		
		
	}
	
	public boolean encompasses (Plot other) {
		
		boolean enc=false;
		
		
		if ((this.depth>=other.depth)&&(this.width>=other.width))
			{
				return true;
			}
			else {
				return false;
				
			}
	
			
		
		}
		
	
	
	
	public int getX()
	{
		
		return x;
		
	}
	
	public void setX(int x)
	{
		
		this.x=x;
	}
	
	
	public int getY() {
		
		return y;
	}
	
	public void setY(int y)
	{
		this.y=y;
		
	}
	
	public int getWidth() {
		
		return width;
	}
	public void setWidth(int width) {
		
		this.width=width;
		
	}
	
	
	public int getDepth() {
		
		return depth;
	}
	
	public void setDepth(int depth) {
		
		
		this.depth=depth;
	}
	public String getplot() {
		
		return x+","+y+","+depth+","+width;
	}

	
	
	
	
	
	
	
	
}
