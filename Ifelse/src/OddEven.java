public class OddEven {

    public static void oddEven(int a, int d){
        String b = (a % 2 == 0)? ("Number is even"):("Number is odd");
        String c = (d % 2 == 0)? ("Number is even"):("Number is odd");
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String args[]){

        oddEven(26,77);


    }
}
