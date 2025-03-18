public class helloWorld {
    public class Simple{
        public static void name(){
            System.out.println(" Ranjith Kumar ");
        }
        public void age(){
            System.out.println(20);
        }
    }
    public static void main(String[] args) {
        Simple.name();  // Correctly calling the static method
        helloWorld parent = new helloWorld();
        helloWorld.Simple obj = parent.new Simple();
        obj.age();
    }
}
