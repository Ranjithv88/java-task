import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many you want = ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }
}

