public class ReverseString {
    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        rs.reverse01();
    }
    public void reverse01() {
        String name = "java";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
    }
}

