package floyd;

import static gdi.MakeItSimple.*;

public class FloydTriangle {

	public static void main(String[] args) {
		int n, c, d; 
		//num = 1;
		
		System.out.println("Number of rows for triangle: ");
		n = readInt();
		//readLine();
		
		System.out.println("Floyds triangle:-");
		
		for(c = 1; c <= n; c++){
			for(d = 1; d <= c; d++){
				System.out.print("*");
			//	num++;
			}
			
			System.out.println();
		}

	}

}
