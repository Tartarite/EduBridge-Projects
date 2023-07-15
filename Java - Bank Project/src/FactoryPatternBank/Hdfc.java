package FactoryPatternBank;

public class Hdfc extends Bank {
	Hdfc(){
		this.name="Hdfc";
		this.roi=(float) 0.8;
	}
	
	@Override
	public void display() {
		System.out.println(this.name + " " + this.roi);
	}
}
