package polymorphism;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;
public Car(int cylinders, String name) {
	this.cylinders = cylinders;
	this.name = name;
	this.engine = true;
	this.wheels = 4;
}

public String startEngine() {
	return "car -> startEngine()";
}

public String accelerate() {
	return "car -> accelerate()";
}

public String brake() {
	return "car -> brake()";
}

public int getCylinders() {
	return cylinders;
}

public String getName() {
	return name;
}

}
