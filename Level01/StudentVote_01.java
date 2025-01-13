import java.util.Scanner;

class StudentVote_01{
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input= new Scanner(System.in);
		
		//Assiging length
		int length=10;
		int[] arr = new int[length];
		
		//Enter age of all students:
		System.out.println("Enter age of students : ");
		for(int i=0; i<length; i++){
			// Take input for age
			arr[i]=input.nextInt();
		}	
		
		for(int j=0;j<length;j++){
			//Checking the age criteria:
			if(arr[j]>=18){
				System.out.println("The student with the age " + arr[j] + " can vote.");
			} else if (arr[j]<18 && arr[j]>=0){
				System.out.println("The student with the age " + arr[j] + " cannot vote.");
			} else {
                System.out.println("Invalid age");
            }
		}	
		
        //Closing Scanner class		
        input.close();
	}		
}		