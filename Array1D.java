package day2;

public class Array1D {
	
	public static void main(String[] args) {
		//datatype arrname[] = new arrname[size];
		
		//declaration
		int marks[];
		
		//Intialization
		marks = new int[6];
		
		marks[0]=10;
		System.out.println(marks[0]);
		
		marks[1]=20;
		
		System.out.println(marks[1]);
		
		System.out.println(marks[2]);
		
		int sal[] = {20000,30000,40000};
		System.out.println("value of sal stored at index 2  "+ sal[2]);
		System.out.println("The length of the array:" + sal.length);
		
	}
	

}
