package FactoryPatternBank;

public class Axis extends Bank {
	Axis(){
		this.name="Axis";
		this.roi=(float) 0.6;
	}
	
	@Override
	public void display() {
		System.out.println(this.name + " " + this.roi);
	}
}
