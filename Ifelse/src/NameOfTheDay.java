public class NameOfTheDay {

    public static void nameOfTheDay(int a) {
        if (a == 1) {
            System.out.println("Today is Monday");
        } else if (a == 2) {
            System.out.println("Today is Tuesday");
        } else if (a == 3) {
            System.out.println("Today is Wednesday");
        } else if (a == 4) {
            System.out.println("Today is Thursday");
        } else if (a == 5) {
            System.out.println("Today is Friday");
        } else if (a == 6) {
            System.out.println("Today is Saturday");
        } else if (a == 7) {
            System.out.println("Today is Sunday");
        } else {
            System.out.println("Please enter Number between 1 to 7");
        }

    }

    public static void main(String[] args) {
        nameOfTheDay(1);
        nameOfTheDay(2);
        nameOfTheDay(3);
        nameOfTheDay(4);
        nameOfTheDay(5);
        nameOfTheDay(6);
        nameOfTheDay(7);
        nameOfTheDay(8);
    }

}
