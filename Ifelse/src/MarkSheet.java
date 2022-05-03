public class MarkSheet {
    public static void markSheet(int rollNo, String name, int a, int b, int c) {
        int TotalMarks = (a + b + c); // marks is out of hundred
        double percentage = TotalMarks / 3;//Average percentage of three subjects

        if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {
            System.out.println("Name is " + name);
            System.out.println("RollNumber is " + rollNo);
            System.out.println("Marks of math is " + a);
            System.out.println("Mark of science is " + b);
            System.out.println("Mark of english is " + c);
            System.out.println("Total marks of three subject is " + TotalMarks);
            System.out.println("Average percentage of three subject is " + percentage+ "%");

             if (percentage >= 80) {
                System.out.println(" Grade is A+");
            } else if (percentage >= 60) {
                System.out.println("Grade is A");
            } else if (percentage >= 50) {
                System.out.println("Grade is B");
            } else if (percentage >= 35) {
                System.out.println("Grade is c");
            } else {
                System.out.println("Result is fail");
            }
            } else {
            System.out.println("Invalid marks");
        }
    }

    public static void main(String args[]) {
        markSheet(25, "Rudra", 25, 45, 80);
    }
}
