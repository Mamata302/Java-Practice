package day9;

public class Encapsul_main {
	
	public static void main(String[] args) {
		
		Encaapsul1 E1 = new Encaapsul1();
		
		System.out.println("  PROFILE DETAILS\n");
		
		E1.setComplexion("Wheatish");
		System.out.println(" Complexion : " + E1.getComplexion());
		
		E1.setHeight(5.2);
		System.out.println(" Height     : "  + E1.getHeight() + " inch");
		
		E1.setWeight(55);
		System.out.println(" Weight     : " + E1.getWeight() + " kg");
		
		E1.setAge(30);
		System.out.println(" Age        : " + E1.getAge() + " years\n");
		
		System.out.println(E1);
		
	}

}
