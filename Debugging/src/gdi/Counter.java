package gdi;

public class Counter {
	private int result = 0;
	private int fetz = 1;
	
	public int getResult(){
		return result;
	}
	
	public int getFetz(){
		return fetz;
	}
	
	public void count(){
 		for (int i = 0; i < 100; i++){
			result += i+1;
			fetz = fetz *result;
			System.out.println(result);
			System.out.println(fetz);
		}
	}
}
