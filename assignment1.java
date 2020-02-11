import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		
		double fahrenheit;
		double windspeed;
		double windChill;
		double power;
		double NUMPOWER=.16;
		
		System.out.println("Wind chill calculator");
		
		Scanner Fscanner= new Scanner(System.in);
		Scanner Wscanner= new Scanner (System.in);
		
		System.out.println("Enter the fahrenheit (must be >=-45 and <=40)");
		
		fahrenheit = Fscanner.nextDouble();
		
		System.out.println("Enter the windspeed (must be >=5 and <=60)");
		windspeed=Wscanner.nextDouble();
		
		power= Math.pow(windspeed, NUMPOWER);
		
		
		
		
		windChill=35.74+ 0.6215*(fahrenheit)-(35.75*power)+(0.4275*fahrenheit*power);
		
		System.out.println("The windchill is "+ windChill);
		
		System.out.println("Programmer: Senay Alemayehu");
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
