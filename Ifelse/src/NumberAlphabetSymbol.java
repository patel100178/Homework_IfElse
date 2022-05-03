public class NumberAlphabetSymbol {
    static char ch;
    public static void numberAlphabetSymbol( char ch){
        System.out.println(ch);
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " is Alphabet");
        }
        else if (Character.isDigit(ch)){
            System.out.println(ch + " is Number" );
        }
        else{
            System.out.println(ch + " is Symbol ");
        }
    }

    public static void main(String args[]){

        numberAlphabetSymbol('-');
    }
    }
