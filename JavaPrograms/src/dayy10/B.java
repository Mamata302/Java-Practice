package dayy10;

public class B extends A {

		public B() {
			System.out.println("I am constructor of the class B");
		}
		
		public B(int num) {
			super(10);
			System.out.println("Class B Employee Sl No. :" + num);
			
		}

		public void EmpId(int EmpId) {
			System.out.println("\nClass B Employee ID =:" + EmpId);
		}

		public void salary(int salary) {
			System.out.println("\nClass B Employee Salary :" + salary);
		}
		
		public void display() {
			
			this.EmpId(11);          //local reference
			
			super.EmpId(12);         //parent reference
			
			this.salary(60000);		//class B Salary
			
			super.salary(50000);	//class A Salary
		}
	
	}
