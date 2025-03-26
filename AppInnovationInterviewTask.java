public class AppInnovationInterviewTask {
    public void method01(){
        String word = "Tomorrow";
        char[] array = word.toCharArray();
        int num = 0;
        for (char a : array) {
            if (a == 'o') {
                num++;
                for (int i = 1; i <= num; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.print(a);
            }
        }
    }
    public void method02(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(" ".repeat(5-i)+"* ".repeat(i));
        }
    }
    public void method03(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("* ".repeat(i)+" ".repeat(6-i)+" *".repeat(i));
        }
    }
    public static void main(String[] args){
        AppInnovationInterviewTask app = new AppInnovationInterviewTask();
        app.method01();
        app.method02();
        app.method03();
    }
}

