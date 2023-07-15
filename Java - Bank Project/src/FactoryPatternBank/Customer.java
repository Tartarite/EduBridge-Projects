package FactoryPatternBank;

public class Customer {
	public static void main(String args[]) {
		
		Factory f1 = new Factory();
		Bank b1 =  f1.getBank("icici");
		Bank b2 =  f1.getBank("hdfc");
		Bank b3 =  f1.getBank("axis");
		b1.display();
		b2.display();
		b3.display();
	}
}