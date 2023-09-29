package day6;

public class Inheritance {

	public static void main(String[] args) {
		
		Parent_telephone PP = new Parent_telephone();
		
		PP.landline();
		PP.voicecalls();
		PP.keypad();
		 
		 System.out.println("*******************************\n");
		 
		 Child_phone CC = new Child_phone();
		 
		CC.landline();
		CC.voicecalls();
		CC.keypad();
		CC.Mobile();
		CC.Textmessaging();
		CC.Contactinfo();
		 
		 System.out.println("*******************************\n");
			
		 Grandchild_smartph GG = new Grandchild_smartph();
		 
		 GG.landline();
		 GG.voicecalls();
		 GG.keypad();
		 GG.Mobile();
		 GG.Textmessaging();
		 GG.Contactinfo();
		 GG.Touchscreen();
		 GG.Camera();
		 GG.Internet();
		 GG.GPS();
		 
		 System.out.println("********************************\n");
		 
		Child2_phone2 CC2 = new Child2_phone2();
		 
		CC2.landline();
		CC2.voicecalls();
		CC2.keypad();
		CC2.CallerId();
		CC2.BasicInternet();
		 
		System.out.println("********************************\n");
		
		Grandchild2_smartph2 GG2 = new Grandchild2_smartph2();
		 
		GG2.landline();
		GG2.voicecalls();
		GG2.keypad();
		GG2.CallerId();
		GG2.BasicInternet();
		GG2.Multimedia();
		GG2.Personalization( );	 
		 
		 
	}

	
}


