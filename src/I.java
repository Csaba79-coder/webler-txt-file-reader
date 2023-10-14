public class I {

    private String i = "i";

    public static void main(String[] args) {
        new I().call();
    }

    public static String i(String i) {
        return i;
    }

    public void call() {
        String i = i(this.i);
        System.out.println(i);
    }
}
