public class PrintStar {
    public static void main(String[] args){
        for(int i=0;i<=6;i++){
            System.out.println(" ".repeat(6-i)+"* ".repeat(i)+"  ".repeat(6-i)+"* ".repeat(i));
        }
        for(int i=5;i>=0;i--){
            System.out.println(" ".repeat(6-i)+"* ".repeat(i)+"  ".repeat(6-i)+"* ".repeat(i));
        }
    }
}

