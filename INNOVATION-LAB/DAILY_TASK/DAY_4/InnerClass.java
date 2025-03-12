import java.util.*;

class Computer {
    class Processor {
        void display() {
            System.out.println("Processor is functioning");
        }
    }
    
    void showDetails() {
        class Memory {
            void info() {
                System.out.println("Memory is being accessed");
            }
        }
        Memory memory = new Memory();
        memory.info();
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.display();
        computer.showDetails();
    }
}