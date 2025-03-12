class Battery {
    private int capacity;
    
    public Battery(int capacity) {
        this.capacity = capacity;
    }
    
    public int getCapacity() {
        return capacity;
    }
}

class Mobile {
    private Battery battery;
    
    public Mobile(int batteryCapacity) {
        this.battery = new Battery(batteryCapacity);
    }
    
    public void showBatteryInfo() {
        System.out.println("Mobile battery capacity: " + battery.getCapacity() + "mAh");
    }
}

public class Composition {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(5000);
        mobile.showBatteryInfo();
    }
}
