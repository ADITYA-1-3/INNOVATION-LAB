class Battery {
    
    int capacity; 

    Battery(int capacity) {
        this.capacity = capacity;
    }
    void displayBatteryInfo() {
        System.out.println("Battery capacity: " + capacity + "mAh");
    }
}
class Mobile {
    
    Battery battery;
    String model;
    String brand;

    Mobile(String model, String brand, int batteryCapacity) {
        this.model = model;
        this.brand = brand;
        this.battery = new Battery(batteryCapacity); 
    }

    void displayMobileInfo() {
        System.out.println("Mobile Model: " + model);
        System.out.println("Brand: " + brand);
        battery.displayBatteryInfo(); 
    }
}

public class Composition {
    public static void main(String[] args) {
       
        Mobile mobile1 = new Mobile("iPhone 13", "Apple", 3300);
        Mobile mobile2 = new Mobile("Galaxy S21", "Samsung", 4000);
        
        mobile1.displayMobileInfo(); 
        System.out.println();
        mobile2.displayMobileInfo(); 
    }
}
