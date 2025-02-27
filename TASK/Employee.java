public class Employee {
    
    private int id ;
    private float salary ;
    

    public void setid(int id){
        if (id>0){
            this.id = id ;

        }
        else {
            System.out.println("INVALID USER  ID ");
        }
    }
        public void setsalary(float salary){
            this.salary = salary ;

        }
        public int getid(){
            return id;

        }
        public float  getsalary(){
            return salary;
        }


        public static void main (String [] args ){
            Employee obj = new Employee();

            obj.setid(6921793);
            obj.setsalary(50000);

            System.out.println("ID :"+ obj.getid());
            System.out.println("SALARY :"+obj.getsalary());
        }

}
