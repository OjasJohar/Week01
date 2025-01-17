import java.util.Scanner;

public class FindLongestWord_05{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input
		System.out.println("Enter the String : ");
		String str=input.nextLine();
		
		int count=0, index=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				count++;
		}
		
		String temp="";
		String[] words=new String[count+1];
		for(int j=0;j<str.length();j++){
			if(str.charAt(j)!=' '){
				temp += str.charAt(j);
			}else{
				words[index]=temp;
				index++;
				temp="";
			}
		}
		words[index]=temp;
		
		int l=0;
		String longestWord="";
		while(index>=0){
			if(words[index].length()>l){
				l=words[index].length();
				longestWord=words[index];
			}
			index--;
		}
		System.out.println("Longest Word : "+ longestWord);
		
		//Closing Scanner class
		input.close();
	}
}