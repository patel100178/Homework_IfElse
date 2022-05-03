public class InterchangedValue {

    public static void interchangedValue(int a, int b) {
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }

    public static void main(String args[]) {
        interchangedValue(25, 35);

    }
}

