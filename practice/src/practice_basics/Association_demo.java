package practice_basics;
class Car{
	
	String carname;
	Engine engine;
	Car(String carname,Engine engine){
		this.carname=carname;
		this.engine=engine;
	}
	public void cardetails() {
		System.out.println("car name::"+carname);
		System.out.println("Model year::"+engine.modelyear);
	}
}
class Engine{
	String modelyear;
	Car car;
	public Engine(String modelyear,Car car) {
		this.modelyear=modelyear;
		this.car=car;
	}
	public void enginedetails() {
		System.out.println("ModelYear::"+modelyear);
		System.out.println("Carname::"+car.carname);
	}
}

public class Association_demo {

	public static void main(String[] args) {
	
		Car c1= new Car("eriga", new Engine("2001",null));
		c1.cardetails();
		System.out.println();
		Engine e1=new Engine("2002", c1);
	e1.enginedetails();

	}

}
