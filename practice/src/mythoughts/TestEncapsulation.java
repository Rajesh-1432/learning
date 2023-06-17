package mythoughts;

class Account {  
	
	private long acc_no;  
	private String name;
	private String email;  
	private float amount;  
	  
	public long getAcc_no() {  
	    return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
	    this.acc_no = acc_no;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public float getAmount() {  
	    return amount;  
	}  
	public void setAmount(float amount) {  
	    this.amount = amount;  
	}  
	  
	}  


public class TestEncapsulation {

	public static void main(String[] args) {
	
		
		Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAcc_no(756012414000L);  
	    acc.setName("Jaiswal");  
	    acc.setEmail("sonoojaiswal@gmail.com");  
	    acc.setAmount(600000f);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+":: "+acc.getName()+" ::"+acc.getEmail()+":: "+acc.getAmount());  

	}

}
