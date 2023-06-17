package mythoughts;
//Constructor declaration by using Super
class Car{  
 Car(){
	System.out.println("Parent class constructor::");}  
}  
class Suzuki extends Car{  
	Suzuki(){  
super();  
System.out.println("Child class Constructor");  
}  
}  

	
public class SuperKeyword {
	
		public static void main(String args[]){  
			Suzuki d=new Suzuki();  
			  
			  
	}

}
