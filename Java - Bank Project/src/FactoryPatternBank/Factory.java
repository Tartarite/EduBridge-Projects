package FactoryPatternBank;

public class Factory {
	public Bank getBank(String type){
		if(type==null)
			return null;
		if(type.equalsIgnoreCase("ICICI")) {
			return new Icici();
		}
		else
			if(type.equalsIgnoreCase("AXIS")) {
				return new Axis();
			}
		else
			if(type.equalsIgnoreCase("HDFC")) {
					return new Hdfc();
			}
		return null;
	}
}
