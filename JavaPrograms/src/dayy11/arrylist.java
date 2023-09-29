package dayy11;

import java.util.ArrayList;
import java.util.List;

public class arrylist {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println("Size : "  + list.size());
		
		System.out.println(list);
		
			for(int x: list) {
			
			System.out.println(x);
			
		}
		
		System.out.println("*******************");
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println("Size : "  + list.size());
		
		System.out.println(list);
		
			for(int x: list) {
			
			System.out.println(x);
			
		}
		
		
	}

}
