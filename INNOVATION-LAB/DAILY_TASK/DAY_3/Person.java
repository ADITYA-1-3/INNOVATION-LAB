//package INNOVATION-LAB.DAILY_TASK.DAY_3;

public class Person {
        String name;
        int age;
    
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        
        public void introduce() {
            System.out.println("HELLO ! " + this.name);
            System.out.println("YOU ARE " + this.age + "OLD");
        }
    
        public static void main(String[] args) {
            Person s1 = new Person("arjuna", 19);
            s1.introduce();
        
    }
}
