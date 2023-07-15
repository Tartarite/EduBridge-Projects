package FactoryPatternBank;

public class Icici extends Bank{
	
	Icici(){
		this.name="Icici";
		this.roi=(float) 0.4;
	}
	
	@Override
	public void display() {
		System.out.println(this.name + " " + this.roi);
	}
}
