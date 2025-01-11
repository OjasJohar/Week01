//05. Suppose you have to divide 14 pens among 3 students equally. 
//Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

import java.lang.*;

class Pen_Distribution_05{
	
	public static void main(String[] args){
		
		//Given : 14 pens among 3 students
		int pens = 14, students = 3;
		
		//Calculating pens each student will get :
		int pensDividedEqually = pens/students;
		
		//Calculating remaining non-distributed pens
		int nonDistributedPen = pens % students;
		
		System.out.print("The Pen Per Student is "+ pensDividedEqually +
		" and the remaining pen not distributed is "+ nonDistributedPen);
	}
}	