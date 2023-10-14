public class Scope {

    private static final String CLASS_VARIABLE = "Class Scope";

    public static void main(String[] args) {
        System.out.println(CLASS_VARIABLE);
        method();
        method(CLASS_VARIABLE);
    }

    public static void method() {
        System.out.println(CLASS_VARIABLE);
    }

    public static void method(String classVariable) {
        classVariable = "Method Scope";
        System.out.println(classVariable);
    }

    public static void method2(String classVariable) {
        // for ciklus vagy for loop (fori)
        for (int i = 0; i < classVariable.length(); i++) {
            System.out.println(classVariable.charAt(i));
        }
        // for each loop (iter)
        for (String character : classVariable.split("")) {
            System.out.println(character);
        }
    }
}
