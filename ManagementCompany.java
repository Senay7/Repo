


//Author: Senay Alemayehu

public class ManagementCompany{
	

	
	
	private double MAX_PROPERTY=5;
	private double mgmFeePer;
	private String name;
	private Property properties[]=new Property[5];
private	String taxID;
	private final int MGMT_WIDTH=10;
	private	final int MGMT_DEPTH=10;
	
	
	private Plot mgmt=new Plot(0,0,10,10);
	
	int count;
	
	
	
	//No-Arg Constructor that creates a ManagementCompany object using empty strings and a default Plot. "properties" array is initialized here as well.
	public ManagementCompany(){
		
		properties=new Property[5];
		
		
		
		this.mgmFeePer=0;
		this.name="";
		this.taxID="";
		this.count=0;
		
	
	
	}
	
	
	
	
	//Constructor Creates a ManagementCompany object using the passed information. Mgmt Co plot is initialized to default Plot. "properties" array is initialized here as well.
	public ManagementCompany(String name1, String taxID1, double mgmFee1) {
		
		properties=new Property[5];
		this.name=name1;
		this.taxID=taxID1;
		this.mgmFeePer=mgmFee1;
		
		this.count=0;
		
		
		
	}
	
	
	
	
	//Constructor creates a ManagementCompany using the passed information."properties" array is initialized here as well
	
	public ManagementCompany (String name1, String taxID1, double mgmFee1, int x1, int y1, int width1, int depth1)
	{
		
		properties=new Property[5];
		this.name=name1;
		this.taxID=taxID1;
		this.mgmFeePer=mgmFee1;
		this.mgmt=new Plot(x1,y1,width1,depth1);
		this.count=0;
		

		
		
	}
	
	
	
	


	
	public ManagementCompany(ManagementCompany otherCompany1){
		properties= new Property[5];
		this.name=otherCompany1.name;
		this.taxID=otherCompany1.taxID;
		this.mgmFeePer=otherCompany1.mgmFeePer;
	
		
		this.mgmt=otherCompany1.mgmt;
		
	}
	
	
	public int getMax_Property() {
		
		return 5;
	}
	
	
	
	
	
	
	//Adds the property object to the "properties" array.
	
	public int addProperty(Property property)  {
        int i;
        
        
       

        
        if(count >= MAX_PROPERTY-1) {
                return  -1;
        }
        
        
        
        else if(property== null) {
                return  -2;
        
}
        else { 
        	for (i=0;i<count; i++) {
        	  
        	 if (properties[i].getPlot().overlaps(property.getPlot())) {
        		 return -4;
        		 
        	 }
        	 else {
        		 
        		 
        	 }
        	 
         }
        }
         
         
         if(!mgmt.encompasses(property.getPlot()) ) {
        return  -3;
         	}
   else 
        {
                properties[count]=property;
                
                return count++;
        }
        

}

			
			
			
			
			
	
			
		
			
		
	
	
	
	
	//Creates a property object and adds it to the "properties" array, in a default plot.
	public int addProperty(String name, String city, double rent, String owner) {
        
        //create a property object.
        Property property = new Property(name, city, rent, owner, 0, 0, 1,1);
        
       
        int i;
        for( i =0; i <= count; i++) {
        	if (properties[i].getPlot()==null) {
        		break;
        	}
        	else if(properties[i].getPlot().overlaps(property.getPlot())) {
                        return -4;}
        	else {
        		
        		
        	}
                
        }
        
        
        if(count >= MAX_PROPERTY-1) {
                return -1;
        }
        if(!mgmt.encompasses(property.getPlot())) {
        //else if()
        return -3;
        }
        else 
        {
        	//adds the property object to properties array. 
            properties[count] = property;
            count++;
                return count;
        }
}
	
	
	
	

	/** Senay Alemayehu
city - location of the property
rent - monthly rent
owner - owner of the property
x - x location of upper left corner of property's plot
y - y location of upper left corner of property's plot
width - width of the property's plot
depth - depth of the property's plot
*/
	public int addProperty(String name, String city, double rent, String owner,int x, int y,int width, int depth) {
        int i;
        //Creates a property object that calls the constructor of Plot. 
        Property property = new Property(name, city, rent, owner, x, y,width, depth);
        
        // create a plot
        //Plot plot = new Plot(x,y, width, depth);
        
        // Question is this the correct way of checking if the plot overlaps with the other property plots?????
        for( i =0; i <= count; i++) {
        	
        	if (properties[i].getPlot()==null) {
        		break;
        	}
        	else if(properties[i].getPlot().overlaps(property.getPlot())) {
                        return -4;
        	}
        	else {
        		
        	}
        }
        if(count >= MAX_PROPERTY-1) {
                return  -1;
        }
        else if(!mgmt.encompasses(property.getPlot()) ) {
                return  -3;
        }
        else 
        {
                properties[count]=property;
                count++;
                return count;
        }
        
}
        

	
	
	

public double totalRent() {
	
	double total=0;
	
	for (int x=0; x<count;x++) {
		
		total+=properties[x].getrentAmount();
		
	}
	return total;
	
	
	
	
}

public int AddPropertyDefaultPlot() {
	
	//student should add property with 4 args & default plot (0,0,1,1)
	//student should add property with 8 args
	//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
	
	Property default1= new Property(0,0,1,1);
	Property test=new Property("name1", "string" , 5.0,"taxID", 1, 0, 0, 0);
	return -1;
	
	
}

public double maxRentProp() {
	
double max=0;


for (int x=0;x<=count;x++) {
	
	if (properties[x].getrentAmount()>max) {
		
		max=properties[x].getrentAmount();
	}
	
}
return max;
	
}







public int maxRentPropertyIndex() {
	
	double max=0;
	int maxIndex=0;
	for (int x=0;x<count;x++) {
		
		if (properties[x].getrentAmount()>max) {
			
			max= properties[x].getrentAmount();
			maxIndex=x;
		}
		else {
			
		}
		
	}
	return maxIndex;
}


	public String displayPropertyAtIndex (int i) {
        String str = "";
      
                str= ("Owner: " + properties[i].getOwner() + "\nCity: " + properties[i].getCity() 
                                + "\nProperty Name: " + properties[i].getPropertyName() + "\nRent Amount: " + properties[i].getrentAmount());
                               
                
        
        
        return str;
        
}


	public String toString() {
        
        String printContent = "";
        System.out.println("List of the properties for Alliance, taxID: " + taxID );
        
        System.out.println("__________________________________________________");
        
        for(int i = 0; i < count; i++) {
                
              
                        System.out.println( (" Property Name: " + properties[i].getPropertyName() +"\n" +
                                "  Located in: " + properties[i].getCity() + "\n" + 
                                "  Belonging to: " + properties[i].getOwner() + "\n" + 
                                "  Rent Amount: " + properties[i].getrentAmount())); 
                
        }
        
        System.out.println("__________________________________________________");
        System.out.println("Total management Fee: " + mgmFeePer*count);
        
        
        return printContent;
}

        
	public int getMGMT_WIDTH() {
		return MGMT_WIDTH;
	}










}