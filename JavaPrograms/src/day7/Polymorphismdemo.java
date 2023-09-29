package day7;

public class Polymorphismdemo {

	public static void main(String[] args) {
		
     Game PP = new Game();
		
		PP.Football();
		PP.Cricket();
		PP.Basketball();
		 
	System.out.println("**********************\n");
		 
		 Game CC = new Ground();
		 
		 CC.Football();
		 CC.Cricket();
		 CC.Basketball();
	
    System.out.println("***********************\n");
	
         Player PL = new Player();
    
         PL.Football();
	     PL.Cricket();
	     PL.Basketball();
	     
	System.out.println("***********************\n");
	 	
         Time TT = new Time();
    
	     TT.Duration();
	     TT.Football();
	     TT.Cricket();
	     TT.Basketball();

	 System.out.println("***********************\n");
	 
	      Match MH = new Match();
	      
	      MH.T20();
	      MH.ODI();
	      MH.Football();
		  MH.Cricket();
		  MH.Basketball();
 
	 System.out.println("***********************\n");

	}

}
