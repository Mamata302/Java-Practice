package dayy11;

public class arrydemo {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		System.out.println("Length of the array : "  +  arr.length);
		
		System.out.println("\n 1st index value :" +arr[0]);
		
		for(int i=0;i<arr.length;i++) {
	
		System.out.println(arr[i]);
	
		}
	
		for (int x:arr) {
			
			System.out.println("\n" + x);
				
		}
	}
}

