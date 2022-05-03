public class PositiveNegativeNumber {

    public static void numberPositiveNegativeOrZero (int a){
        if(a<0){
            System.out.println(a+" is a negative number.");
        }
        else if(a>0){
            System.out.println(a+" is a positive number.");
        }
        else {
            System.out.println(a+" is a zero");
        }

    }

    public static void main(String[] args) {
        numberPositiveNegativeOrZero(24);
        numberPositiveNegativeOrZero(-23);
        numberPositiveNegativeOrZero(0);

    }
}
