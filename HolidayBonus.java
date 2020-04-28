
public class HolidayBonus {

	

	

	/**
	 * 
	 * @param data- two dimensional array of store sales
	 * @param high- bonus for the highest store in category
	 * @param low-bonus for lowest store in category
	 * @param other-bonus for all other stores in category
	 */
	
	
	public static double[] calculateHolidayBonus(double data[][], double high, double low, double other) {
		
		//Number of rows to test
		int length=data.length;
		
		double bonuses[]= new double [length];
	
		
		//Test for every row
		for (int x=0; x<length; x++) {
			
		
			
			//Initialize returning array for row to 0
			bonuses[x]=0;
			
			
			//Test for every column in the row
			for (int k=0; k<data[x].length;k++) {
				
			
				//If statement to see if value is highest in the column
				if (data[x][k]==TwoDimRaggedArrayUtility.getHighestInColumn(data, k)) {
					bonuses[x]+=high;
					
				}
				
				//If statement to see if value is lowest in the column
				else if (data[x][k]==TwoDimRaggedArrayUtility.getLowestInColumn(data, k)) {
					bonuses[x]+=low;
					
					
				}
				
				
				//Else statement to add other bonus value if not max or min sales in the row
				else {
					bonuses[x]+=other;
					
				}
				}
			
				
				
			}
	for (int x=0; x<bonuses.length; x++) {
		System.out.print(bonuses[x]);
		
	}
			return bonuses;
			
		}
		
		
		
		
	
	
	
	
	
	/**
	 * 
	 * @param data- two dimensional array of store sales
	 * @param high- bonus for the highest store in category
	 * @param low-bonus for lowest store in category
	 * @param other-bonus for all other stores in category
	 */
	
	public static  double calculateTotalHolidaybonus(double data[][], double high, double low, double other) {
		
		
		double bonuses[]=calculateHolidayBonus(data,high,low,other);
		
		int length=bonuses.length;
		double total=0;
		
		for (int x=0; x<length; x++) {
			total+=bonuses[x];
			
		}
		return total;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
