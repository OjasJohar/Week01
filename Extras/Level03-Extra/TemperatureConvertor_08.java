import java.util.Scanner;

public class TemperatureConvertor_08{
	
	public static double calculateDegree(double fehranheit){
		double feh2cel= ((fehranheit-32)*5)/9;
		return feh2cel;
	}
	
	public static double calculateFehranheit(double celsius){
		double cel2feh=(9*celsius)/5+32;
		return cel2feh;
	}
	
	public static void main(String[] args){
		Scanner scanner =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the temperature in degree celsius:");
		double celsius=scanner.nextDouble();
		
		double cel2feh=calculateFehranheit(celsius);
		
		//display the output
		System.out.println("The temperature in celsius is: " + celsius);
		System.out.println("The temperature in fehranheit is: " + cel2feh);
		
		//taking input from the user
		System.out.println("Enter the temperature in degree celsius:");
		double fehranheit=scanner.nextDouble();
		
		double feh2cel=calculateDegree(fehranheit);
		
		//display the output
		System.out.println("The temperature in fehranheit is: " + fehranheit);
		System.out.println("The temperature in celsius is: " + feh2cel);
	}
}