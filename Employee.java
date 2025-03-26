class Employee {
     private int id;
     private String name;
     private long salary;

     public Employee(int id, String name, long salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }

     public void display() {
         System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
     }

     public static void main(String[] args) {
         Employee emp = new Employee(101, "John Doe", 55000);
         emp.display();
         Employee emp01 = new Employee(102, "John", 60000);
         emp01.display();
     }
}

