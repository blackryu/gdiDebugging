package brokenArray;

import java.util.ArrayList;
import java.util.List;

public class BrokenArray {

	
	public static void main(String[] args) {
		
		
		List list = new ArrayList<>();
		for (int i = 0; i < 10; i++){
			list.add(i);
		}
		
		//int size = list.size();
		
//		for (int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i));
//			list.remove(i);
//		}
		
		int firstElementsIndex = 0;
		
		while(!list.isEmpty()){
			System.out.println(list.get(firstElementsIndex));
			list.remove(firstElementsIndex);
		}

	}

}
