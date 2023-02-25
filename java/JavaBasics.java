import java.util.ArrayList;

public class JavaBasics {
    // Primitive data types
    boolean aBoolean = true;
    byte aByte = 0x10; // or int between -158 to 127
    char aChar = 'a'; // Character representation of ASCII values
    short aShort = 24502; // 2^16 values
    int anInt = 2147483647; // 2^34 values
    long aLong = 3984729384729L; // 2^64 values
    float aFloat = 2342.123F; // 32 bits
    double aDouble = 3423.2342D; // 64 bits

    // Non-primitive (usually user defined)
    String string = "Aditya";

    int[] arr = {1, 2, 3, 4, 5};
    private final int[] test = new int[5]; // "final" keyword -> variable value cannot be changed

    // ArrayList can only have non-primitive data types or wrapper classes of primitive data types
    ArrayList<Integer> marks = new ArrayList<>();
    public void setMarks() {
        // ArrayList.add() can be called only from within a method
        this.marks.add(100);
        this.marks.add(50);
    }

    private interface TestClassInterface {
        public void interfaceMethod();
    }

    public static class TestClass implements TestClassInterface {
        public void testMethod() {
            System.out.println("Self defined method");
        }
        public void interfaceMethod() {
            System.out.println("Interface method");
        }
    }

    // main() method of class is run by default on running java file
    // It must be public, static, void with String[] as input arg
    public static void main(String[] args) {
        System.out.println("Hello");
        TestClass testClass = new TestClass();
        testClass.testMethod();
        testClass.interfaceMethod();

        JavaBasics javaBasics = new JavaBasics();
        javaBasics.conditionalStatements(true, false, true);
        javaBasics.switchCase("Dog");
        javaBasics.loops(false);
    }

    public void conditionalStatements(boolean isMovie, boolean isMovieGood, boolean useTernary) {
        if (useTernary) {
            String output = "Ternary decision: ";
            output += (isMovie && isMovieGood) ? "Go to movie!" : "Don't go to movie";
            System.out.println(output);
            return;
        }

        if (isMovie && isMovieGood) {
            System.out.println("Go to movie!");
        } else if (isMovie || isMovieGood) {
            System.out.println("Not sure");
        } else {
            System.out.println("Don't go to movie");
        }
    }

    public void switchCase(String animal) {
        switch (animal) {
            case "Dog":
                System.out.println("Dog");
                break;
            case "Cat":
                System.out.println("Cat");
                break;
            case "Mouse":
                System.out.println("Mouse");
                break;
            default:
                System.out.println("Unknown animal");
        }
    }

    public void loops(boolean isWhileLoop) {
        String[] fruits = {"mango", "apple", "banana"};

        if (isWhileLoop) {
            int i = 0;
            while (i < fruits.length) {
                System.out.println(fruits[i]);
                i++;
            }
            return;
        }

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}