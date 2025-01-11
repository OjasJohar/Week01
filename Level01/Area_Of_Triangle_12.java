import java.util.Scanner;

public class Area_Of_Triangle_12{

	public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);
                
        //Enter the height of the triangle:
        System.out.println("Enter the height of triangle");
        double heightInCm =input.nextDouble();
 
        //Enter the base of the triangle:
        System.out.println("Enter the base of triangle");
        double baseInCm =input.nextDouble();

        //Calculating area of the triangle:
        double areaInCm = 0.5 * heightInCm * baseInCm;

        //Converting cm in feet:
        double  heightInInch= heightInCm /2.54;
        double baseInInch =  baseInCm / 2.54;
        double areaInInch = 0.5 * heightInInch * baseInInch;
 
        //printing area of triangle
        System.out.println("Area of triangle in cm square is " + areaInCm + 
		" , while area of triangle in feet inches is " + areaInInch);

        input.close();
             
	}
}