package factory;

import org.testng.annotations.Factory;

/*
 * Marks a method as a factory that returns objects that will be used by TestNG as Test classes.
 * The method must return Object[].
 */

public class FactoryAnnotation {

	@Factory
	public Object[] createData() {
		Object[] arr=new Object[3];
		arr[0]=new FactoryMain("Maharashtra", "Mumbai");  
		arr[1]=new FactoryMain("Uttarakhand", "Nainital");  
		arr[2]=new FactoryMain("Maharashtra", "Nasik");  
		return arr;
		
	}
	
}
