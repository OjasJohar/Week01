import java.util.Scanner;

class NumberGuessingGame_01{
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Guess a number between 1 to 100.");
		System.out.println("Plese provide feedback, whether my guesssed number is is high (big), low (small) or correct.");
		
		int guessedNumber;
		int lowerNumber=1;
		int highNumber=100;
		boolean isGuessed=false;
		System.out.println("Enter any key to start the game:");
		char ch=scanner.next().charAt(0);
		
		while(!isGuessed){
		     //GuessedNumber=GuessingNumber(lowerNumber,highNumber);
			 guessedNumber=lowerNumber + (int)(Math.random()* ( highNumber - lowerNumber + 1));
			 System.out.println("Is Your Guessed number : " + guessedNumber);
			 
			
			 
			 boolean isFeedback=false;
			 while(!isFeedback){
				 
			  System.out.println("Provide your Feedback : high, low, correct");
			  String feedback=scanner.next();
			 if(feedback.equalsIgnoreCase("low")){
				 isFeedback=true;
				 highNumber=guessedNumber - 1;
			 }else if(feedback.equalsIgnoreCase("high")){
				 isFeedback=true;
				 lowerNumber=guessedNumber + 1;
			 }else if(feedback.equalsIgnoreCase("correct")){
				 isFeedback=true;
				 isGuessed=true;
			 }else{
				 isFeedback=false;
				 System.out.println("Please provide valid input: high, low, correct");
			   }
			 }
			 
			 if(isGuessed==true){
				System.out.println("Hurray, I have successfully guessed your Number."); 
			 }else if(lowerNumber>=highNumber){
				 isGuessed=true;
				 System.out.println("Sorry, i am not able to guess the Number."); 
			 }
		}
		
		scanner.close();
		
	}
}