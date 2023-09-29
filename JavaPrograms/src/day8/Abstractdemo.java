package day8;

public class Abstractdemo {

	public static void main(String[] args) {

		travel1 TT = new travel2_ext();
		
		TT.flight();
		TT.train();
		TT.bus();
		TT.car();
		
	System.out.println("**********************\n");
		
	System.out.println("**********************\n");

		travel5_ext_impl T6 = new travel5_ext_impl();
		
		T6.flight();
		T6.train();
		T6.bus();
		T6.car();
		T6.helicopter();
		T6.ship();
		T6.van();
		T6.truck();
		T6.taxi();
		T6.motorcycle();
		T6.cycle();	
		
	}

}
