public class NarrowTypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (byte) myDouble;  // Manual casting: double to int
        System.out.println(myDouble);  // Outputs 9.78
        System.out.println(myInt);
    }
}

