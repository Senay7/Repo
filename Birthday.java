import javax.swing.JOptionPane;
import java.util.Random;



public class Birthday {

	public static void main (String [] args ) {
		String name;
		int age;
		double TotalCost=0;
		String Rage; // String to save the input for age
		String toychoice;
		boolean app;
		String process;
		String card;
		String balloon;
		String again;
		Toy one= new Toy ();
		
		Random rand = new Random();
		
		int random= rand.nextInt(100000000);
		
		
		JOptionPane.showMessageDialog(null, "Welcome to the toy company to choose gifts for your child");
		
		
		
		
			int x=0;
		do {
			do {
			
			
			
			 //do while statement for additional toys
				int y=0;
			
			
			app=false;
			toychoice=" ";
			name=" ";
			
				//do while statement for if the order wants to be restarted
			process=" ";	// To initialize process to 0
		
		
		name=JOptionPane.showInputDialog(null, "What is the childs name?");
		
		
		
		
		Rage=JOptionPane.showInputDialog("What is the child's age");
		age=Integer.parseInt(Rage);	//converting string to int for age
		one.setAge(age);		//call set age method
		
		toychoice=JOptionPane.showInputDialog("What toy would you like to get");
		one.setToy(toychoice);
		app=one.ageOK();
		
		
		
		// if statement to decide if age is ok and weather to continue or not
		if (one.ageOK()==false) {
			process=JOptionPane.showInputDialog("The toy is not age appropriate! Would you like to cancel the request?(yes or no)");
			
			
			if (toychoice.toLowerCase().equals("plushie")&&(process.toLowerCase().equals("no"))) {
				
				if (toychoice.toLowerCase().equals("plushie")) {
					app=true;
				
				}
				else if (toychoice.toLowerCase().equals("book")&&(toychoice.toLowerCase().equals("no"))) {
					
					app=true;
				}
				else if (toychoice.toLowerCase().equals("blocks")&&(toychoice.toLowerCase().equals("no"))) {
					
					app=true;
				}
		
			}}
	
					}while(app==false);
			
		
		
		
		
		
		card=JOptionPane.showInputDialog("Would you like to add a card? (yes or no)");
		one.addCard(card);			//to add cost of card if card == true
		
		balloon=JOptionPane.showInputDialog("Would you like to add a balloon? (yes or no)");
		one.addBalloon(balloon);		// to add cost of balloon if balloon == true
		
		
		
		//if else statement to add cost of toy
		if (toychoice.toLowerCase().equals("plushie")) {
			one.addCost(25.00);
			
		}
		else if (toychoice.toLowerCase().equals("book")) {
			
			one.addCost(15.00);
		}
		else if (toychoice.toLowerCase().equals("blocks")) {
			one.addCost(20.00);
			
		}
		
		JOptionPane.showMessageDialog(null, "The gift for " + name+one.toString());
		
		again=JOptionPane.showInputDialog(null, "Would you like to order another toy?(yes or no)");
		
		
		
		
		switch (again) {
		case "yes": 
			TotalCost+=one.getCost();											//to add current toy value to total price
			
			one.addCost(-one.getCost());   										//to initialize cost to 0 again					
			break;
		default: 
			TotalCost+=one.getCost();
			x+=1;															// to change x to !=0 to end while loop
		
		}
		
		
		}while(x==0);									// do while loop will end if user does not want another toy
		
		
JOptionPane.showMessageDialog(null,"The total cost of your order is $"+ TotalCost + "\n Order number is "+ random + "\n Programmer: Senay Alemayehu");
		}
}