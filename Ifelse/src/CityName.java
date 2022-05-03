public class CityName {


    public static void cityName(String i){
        if ( i.toLowerCase() == "a"){
            System.out.println( "City name is Ahmedabad");

        }
        else if (i.toLowerCase() == "b"){
            System.out.println( "City name is Bombay");
        }
        else if (i.toLowerCase() == "c"){
            System.out.println( "City name is Chicago");

        }
        else if (i.toLowerCase() == "d"){
            System.out.println( "City name is Delhi");
        }
        else if (i.toLowerCase() == "e"){
            System.out.println( "City name is Edinburgh");
        }
        else if (i.toLowerCase() == "f"){
            System.out.println( "City name is Fuxin");
        }
        else{
            System.out.println(" Invalid city code");
        }


    }
    public static void main(String args[]) {
        cityName("g");

    }


    }