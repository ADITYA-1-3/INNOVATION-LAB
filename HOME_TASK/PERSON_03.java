package innovation;

public class Persons {
	
	
	String name ; 
	int age ; 
	
	
	public Persons (String name , int age ){
		this.name = name ;
		this.age = age ;
		
	}
	 public void introduce() {
	        System.out.println("HELLO ! MY  NAME :" + this.name + " AGE : " + this.age + " years old.");
	    }

	public static void main(String[] args) {
		 Persons person1 = new Persons("Alice", 30);
		 person1.introduce();
		 
	}

}
