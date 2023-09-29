package day9;

public class Accsmodif1 {
	
	public void pubmethod() {                    // Global Scope
		System.out.println("Public Method");
	}

	private void primethod() {                   // within the class only
		System.out.println("Private Method");
	
	}
	
	protected void protecmethod() {               // outside the package using inheritance
		System.out.println("Protected Method");
	}
	
	void defmethod() {                            // inside the package
		System.out.println("Default Method");
	}
	
	public static void main(String[] args) {
		
		Accsmodif1 mm = new Accsmodif1();
		
		mm.pubmethod();
		mm.primethod();
		mm.protecmethod();
		mm.defmethod();
		
	}
	
}


