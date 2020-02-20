import java.util.Scanner;



public class MovieDriver {
	String title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;
String choice;
		
		while (x==0) {
		Scanner keyboard= new Scanner(System.in);
		
		Movie one= new Movie();
		
		System.out.println("Enter the title of a movie");
		one.setTitle(keyboard.nextLine());
		
		System.out.println("Enter the rating of this movie");
		one.setRating(keyboard.nextLine());
		
		System.out.println("Enter the number of tickets sold for the movie");
		one.setSoldTickets(keyboard.nextInt());
		
		System.out.println(one.toString());
		
		System.out.println("Would you like to try again?(y/n)");
		choice=keyboard.nextLine();
		choice=keyboard.nextLine();
		
		switch(choice) {
		case "y": 
			break;
		default: 
			x+=1;
			System.out.print("Goodbye");
			break;
		
		}
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}
