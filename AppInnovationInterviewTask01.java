public class AppInnovationInterviewTask01 {
    public static void main(String[] args){
        Nuts nuts = new Nuts();  // Create an instance of Nuts
    }
}

class Tree {
    int num = 1;  // Tree class has a num variable
}

class Fruits extends Tree {
    // Constructor for Fruits that increments num
    public Fruits() {
        super.num++;  // Access the num from the Tree class and increment it
    }
}

class Nuts extends Fruits {
    // Constructor for Nuts that increments num
    public Nuts() {
        super();  // Calls the Fruits constructor
        super.num++;  // Access the num from the Tree class and increment it again
        System.out.println(super.num);  // Print the value of num
    }
}
