import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(a);
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

    }
}

