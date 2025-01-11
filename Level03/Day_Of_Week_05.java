import java.util.Scanner;

public class Day_Of_Week_05 {
	
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.print("Enter a month number ");
        int month = input.nextInt();

        //Taking input from user
        System.out.print("Enter a date number ");
        int date = input.nextInt();

        //Taking input from user
        System.out.print("Enter a year number ");
        int year = input.nextInt();
       
        //calculating day of week
        int y0= year - (14 - month ) / 12;
        int x= y0 +y0/4 -y0/100 + y0/400;
        int m0 = month +12 *((14 - month)/12) -2;
        int d0 = (date + x + 31* m0 /12)% 7;

        //printing the result
        if(d0==0){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Sunday.");
        }
        else if(d0==1){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Monday.");
        }   
        else if(d0==2){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Tuesday.");
        }  
        else if(d0==3){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Wednesday.");
        }
        else if(d0==4){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Thursday.");
        }
        else if(d0==5){
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Friday.");
        }
        else {
          System.out.println("The day on the date " + date + "/" 
		  + month + "/" + year + " is Saturday.");
        }
  
        input.close();
    }
}