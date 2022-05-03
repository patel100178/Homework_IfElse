public class VowelConsonant {

    public static void vowelconsonant(String a) {
        a.toLowerCase();

        if ( a == "a" || a == "e" || a == "i" || a == "o" || a == "u")
        {
            System.out.println(a + " is vowel ");
        }
         else {
            System.out.println(a + " is consonant");
        }

    }
    public static void main(String args[]){

            vowelconsonant("B");
    }
    }







