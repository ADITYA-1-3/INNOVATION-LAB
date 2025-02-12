public class CarClass {
	String brand;
	String model;
	double price; 
	
	public CarClass(String brand , String model , double  price ) {
		this.brand = brand ;
		this.model = model ;
		this.price = price ;
		
	}
	public void displaydetails() {
		System.out.println("Car details : \nBRAND :"+ brand +"\nMODEL :"+model+"\nPRICE :"+price);
	}
	public void onroadPrice(double price) {
        this.price = price;
        System.out.println("ON ROAD PRICE : " + this.price);
        }
	public static void main(String[]args) {
		CarClass car1 = new CarClass("TATA","PUNCH",600000);
		car1.displaydetails();
		car1.onroadPrice(720000);
	}
}
