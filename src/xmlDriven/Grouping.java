package xmlDriven;
import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = { "Car" })
	public void Car1() {
		System.out.println("Batch CAR - Test car 1");
	}

	@Test (groups = { "Train" })
	public void Car2() {
		System.out.println("Batch TRAIN - Test car 2");
	}

	@Test (groups = { "Scooter" })
	public void Scooter1() {
		System.out.println("Batch SCOOTER - Test scooter 1");
	}

	@Test (groups = { "Scooter","Bus" })
	public void Scooter2() {
		System.out.println("Batch SCOOTER BUS - Test scooter 2");
	}

	@Test (groups = { "Car", "Sedan Car" })
	public void Sedan1() {
		System.out.println("Batch SEDEN CAR - Test sedan 1");
	}
}
