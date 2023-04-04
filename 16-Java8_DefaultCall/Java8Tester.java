public class Java8Tester {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.print();
	}
}
interface Vehicle {
	default void print() {
		System.out.println("I am a vehicle!");
	}

	// static call
	static void blowHorn() {
		System.out.println("Blow Horn ~~~~~~~~~~~~");
	}
}

interface FourWheeler {
	default void print() {
		System.out.println("I am a FourWheel vehicle!");
	}
}

class Car implements Vehicle, FourWheeler {
	public void print() {
		Vehicle.super.print();
		FourWheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("I am a Four Wheel Car!!!");

	}
}

