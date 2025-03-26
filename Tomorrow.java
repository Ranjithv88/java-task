import java.util.Scanner;

public class Tomorrow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String data = input.next();
        int count = 1;
        for(char a:data.toCharArray()){
            if(a=='o'){
                System.out.print("*".repeat(count));
                count++;
            }else{
                System.out.print(a);
            }
        }
    }
}

