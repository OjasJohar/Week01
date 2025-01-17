import java.util.Scanner;

public class CompareTwoStrings_08{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//Take user input
		System.out.print("Enter the first String  : ");
		String str1=input.next();
		//Take user input
		System.out.print("Enter the second String : ");
		String str2=input.next();
		
		int length;
		if(str1.length()>str2.length())
			length=str2.length();
        else
            length=str1.length();
		
		int i=0;
		String fl="";
		while(i<length){
		    if(str1.charAt(i)==str2.charAt(i)){
			    for(int j=i;j<str1.length();j++){
				    if(str1.charAt(j)<str2.charAt(j)){
						fl="str1";
						break;
					}else if(str1.charAt(j)>str2.charAt(j)){
						fl="str2";
						break;
					}else{
						
					}						
			    }
		    }else{
				if(str1.charAt(i)<str2.charAt(i)){
					fl="str1";
					break;
				}else {
					fl="str2";
				    break;
				}	
			}
		    i++;
		}
		if(fl.equals("str1"))
		    System.out.println("'"+str1+"' comes before '"+str2+"' in lexicographical order");
		else if(fl.equals("str2"))
			System.out.println("'"+str2+"' comes before '"+str1+"' in lexicographical order");
		else {
			if(str1.length()<str2.length()){
			System.out.println("'"+str1+"' comes before '"+str2+"' in lexicographical order");
			}else{
			System.out.println("'"+str2+"' comes before '"+str1+"' in lexicographical order");
			}
		}
			
		//Closing Scanner class
		input.close();
	}
}