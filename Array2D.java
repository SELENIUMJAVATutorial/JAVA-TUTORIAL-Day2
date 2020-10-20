package day2;

public class Array2D {

	public static void main(String[] args) {
		
		int emp[][] = new int[4][5];
		emp[0][0]=1;
		emp[0][1]=25000;
		System.out.println("The value stored at rowindex:0 & colindex:1 ==" + emp[0][1]);
		
		System.out.println("The value stored at rowindex:1 & colindex:1 :::" + emp[1][1]);
	
	 
		System.out.println("The length of the two Dimensional Array is : "+ emp.length * emp[0].length);
		
		//System.out.println("The value stored at rowindex:3 & colindex:2 :::" + emp[3][2]);
	}
}
