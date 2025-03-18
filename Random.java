public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        // Generate a 6-digit random number
        int randomSixDigit = 100000 + random.nextInt(900000); // Ensures it's between 100000 and 999999
        System.out.println("6-digit random number: " + randomSixDigit);
    }
}
