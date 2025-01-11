//07. Write a Program to compute the volume of Earth in km^3 and miles^3

public class Volume_Of_Earth_07{
	
	public static void main(String[] args){
		 
        //given radius in kilometer:
		double radiusInKm = 6378  ;
                 
        //calculating radius in miles:
        double radiusInMl = radiusInKm /1.6;
		 
        //calculating volume in kilometer:
		double volumeInKm =  3.14 * radiusInKm * radiusInKm * radiusInKm *4 /3;
		 
        //calculating volume in miles:
		double volumeInMl = 3.14 * radiusInMl * radiusInMl * radiusInMl *4 /3; ;
		 
        //displaying the output:
		System.out.println("The volume of earth in cubic kilometers is "+ volumeInKm 
		+ " and cubic miles is " + volumeInMl);
	}
}		