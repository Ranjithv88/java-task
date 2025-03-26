import java.util.*;

public class CaliberTask {
    public static void main(String[] args) {
        Program01();
        Program02();
        Program03();
    }
    public static void Program01(){
        int[] input = {2,7,8,9};
        int target = 10;
        int num = 0;
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<input.length;i++){
            for(int b:input){
                if(input[i]+b==target){
                    output.add(i);
                }
            }
        }
        System.out.println(output);
    }
    public static void Program02(){
            int input = 4;
            int number = 2;
            for (int i = 1; i <= input; i++) {
                int printed = 0;
                while (printed < i) {
                    if (isPrime(number)) {
                        System.out.print(number + " ");
                        printed++;
                    }
                    number++;
                }
                System.out.println();
            }
        }
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static void Program03(){
        String input = "Hello";
        String output = "";
        for(int i=input.length()-1;i>=0;i--){
            output += input.charAt(i);
        }
        System.out.println("Input : "+input);
        System.out.println("Output : "+output);
    }

}