package day9;

public class Encaapsul1 {
	
	private String Complexion;
	
	private double Height;
	
	private int Weight;
	
	private int Age;
	
	
	public String getComplexion() {
		return Complexion;
	}

	public void setComplexion(String complexion) {
		Complexion = complexion;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Encapsult1 [Complexion=" + Complexion + ", Height=" + Height + ", Weight=" + Weight + ", Age=" + Age
				+ "]";
	}

	

}
