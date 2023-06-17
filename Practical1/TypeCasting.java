public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int num1 = 10;
        double num2 = num1; // Implicitly cast int to double
        System.out.println("Implicit Casting (int to double): " + num2);

        // Explicit type casting (narrowing)
        double num3 = 20.5;
        int num4 = (int) num3; // Explicitly cast double to int
        System.out.println("Explicit Casting (double to int): " + num4);
    }
}
