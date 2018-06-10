package factory;

import org.testng.annotations.Test;

public class FactoryMain {

	String state;
	String city;
//	public FactoryMain() {
//	}
	public FactoryMain(String state, String city) {
		this.state=state;
		this.city=city;
	}
	
	@Test
	public void printCity() {
		System.out.println("CITY: "+this.city);
	}
	
	@Test
	public void printState() {
		System.out.println("STATE: "+this.state);
	}
}

