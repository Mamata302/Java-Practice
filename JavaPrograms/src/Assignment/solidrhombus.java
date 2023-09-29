package Assignment;

public class solidrhombus {
	
	public static void main(String[] args) {
		
	int n=5;
	int i;
	int j;
	
	for(i=1;i<=n;i++) {
		
		for(j=1;j<10;j++) {
			
			int sum=i+j;
			
			if(sum<=5 || sum>10) {
			System.out.print(" ");
			} else {
				System.out.print("*");
			}
			
		} System.out.println();
			
	}
}
}
