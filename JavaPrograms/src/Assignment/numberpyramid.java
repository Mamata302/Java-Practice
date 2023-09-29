package Assignment;

public class numberpyramid {

	public static void main(String[] args) {
		
		int n=1;
		int i;
		int j;
		
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=5;j++) {
				
				int sum=i+j;
				if(sum>5) {
				System.out.print(n+" ");
				} else {
					System.out.print(" ");
				}
				
			} n++;
			System.out.println();
				
		}
	}
}