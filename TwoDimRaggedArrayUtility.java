import java.io.*;



import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.FilterWriter;



 public class TwoDimRaggedArrayUtility {

	
	
	
	
	
	public static double[][] readFile (File file)
	{
		int row=0;
		double array [][]=null;
		try {
			
			//Open the file
			Scanner x=new Scanner(file);
			//while loop to count the lines in file
			while (x.hasNextLine()) {
				
			++row;
				x.nextLine();
				
			}
			x.close();
			
			
			x=new Scanner (file);
			String line;
			array=new double [row][];
			
			
			for (int i=0; i<array.length; ++i)
			{
				
				line=x.nextLine();
				String [] nums=line.split(" ");
				array[i]=new double [nums.length];
				
				for (int j=0; j<array[i].length; ++j) {
					
					array[i][j]=Double.valueOf(nums[j]);
				}
				
			}
			x.close();
		} 
		
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
		
		
		
		
 }
	
	
	
	
	
	public static void writeToFile(double raggedArray[][], File file) {
		
		try {
		
		//Open file
		PrintWriter writer= new PrintWriter(file);
		
		
		
		//For loop to fill for every row
		for (int x=0; x<raggedArray.length; x++) {
			
		
			
			//For loop to fill for every column in designated row
			for (int f=0; f<raggedArray[x].length; f++) {
				writer.print(raggedArray[x][f]+" ");
				
			}
			
			writer.println();
			
			
		}
		writer.close();
		
		}
		catch (Exception ep) {
			ep.printStackTrace();
			
		}
		
		
		
		
		
	}
	

	public static double getAverage(double raggedArray[][]) {
		int rLength=raggedArray.length;
		double total=0;
		int count=0;
		
		for (int x=0; x<rLength;x++) {
			int cLength=raggedArray[x].length;
			
			
			for (int f=0; f<cLength; f++) {
				total+=raggedArray[x][f];
				count+=1;
			
		}
		
		
		
	}
		
		return total/count;
		
	}
	
	//Returns the total of the selected row in the two dimensional array index 0 refers to the first row.
	public static double getRowTotal(double raggedArray[][], int index) {
		

		double total=0;
		for (int x=0; x<raggedArray[index-1].length; x++) {
			total+=raggedArray[index-1][x];
			
			
		}
		
		
		return total;
	}
	
	
	
	//Returns the total of the selected column in the two dimensional array index 0 refers to the first column. If a row in the two dimensional array doesn't have this column index, it is not an error, it doesn't participate in this method.

	public static double getColumnTotal(double raggedArray[][], int index) {
		
		
	
		double total=0;
		
		for (int x=0; x<raggedArray.length; x++) {
			
			total+=raggedArray[x][index-1];
			
		}
		
		return total;
		
		
		
	}

	
	public static double getHighestInRow(double raggedArray[][], int index) {
		
		int rLength= raggedArray[index].length;
		double max=0;
		
		
		//test for every column in the specified index of the row
		for (int x=0; x<rLength; x++) {
			if (raggedArray[index][x]>max) {
				
				max=raggedArray[index][x];
			}
			
			
		}
		return max;
		
	}
	

	public static double getLowestInRow(double raggedArray[][], int index) {
		
		int rLength= raggedArray[index].length;
		double min=raggedArray[index][0];
		
		
		//test for every column in the specified index of the row
		for (int x=0; x<rLength; x++) {
			if (raggedArray[index][x]<min) {
				
				min=raggedArray[index][x];
			}
			
			
		}
		return min;
		
	}
	
	
	public static double getHighestInColumn(double raggedArray[][], int index) {
		
		
		double max=0;
		
		//for loop test for each row in specified column
		for (int x=0; x<raggedArray.length; x++) {
			if (raggedArray[x].length>index) {
				
				if ((raggedArray[x][index]>max)) {
						
						max=raggedArray[x][index];
					}
				
			}
			else {
				
				
			}
		}
		return max;
		
	}
	
	

	public static double getLowestInColumn(double raggedArray[][], int index) {
		
		int length= raggedArray.length;
		double min=1000;
		
		//Test for each row in specified column index
		for (int x=0; x<length; x++) {
			
			
			
		if (raggedArray[x].length>index) {
				if (raggedArray[x][index]<min) {
				
				min=raggedArray[x][index];
			}
		
			}
		else {
			
		}
		}
		return min;
		
	}
	
	
	public static double getHighestInArray(double raggedArray[][]) {
		
		int r=raggedArray.length;
		double max=0;
		
		for (int x=0;x<r; x++) {
			int c=raggedArray[x].length;
			
			for (int f=0; f<c; f++) {
				
				if (raggedArray[x][f]>max) {
					
					max=raggedArray[x][f];
				}
			}
			
			
			
		}
		return max;
		
	}
	
	
	public static double getTotal(double data[][]) {
		int rows=data.length;
		double total=0;
		
		for (int x=0; x<rows; x++) {
			
			int columns= data[x].length;
			for (int k=0; k<columns;k++) {
				
				total+=data[x][k];
			}
			
		}
		return total;
		
	}
	
	
	
	

public static double getLowestInArray(double raggedArray[][]) {
		
		int r=raggedArray.length;
		double min=raggedArray[0][0];
		
		for (int x=0;x<r; x++) {
			int c=raggedArray[x].length;
			
			for (int f=0; f<c; f++) {
				
				if (raggedArray[x][f]<min) {
					
					min=raggedArray[x][f];
				}
			}
			
			
			
		}
		return min;
		
	}
	
	
	
	
}









