public class LeapYear {

  public static void leapYear (int year) {

      // year to be checked

     // boolean leap;
/*
      // if year is divided by 4
      if (year % 4 == 0) {

      // if year is century
      if (year % 100 == 0) {

      // if year is divided by 400
      // then it is leap year
      if (year % 400 == 0) {
          leap = true;
      } else
        leap = false;
      }

      // if year is not century
      else {
      leap = true;
          }
      }else {
       leap = false;
      }

      if (leap) {

      System.out.println(year + " is a leap year.");
      } else {

      System.out.println(year + " is not a leap year.");

      }*/
      if (year % 4 == 0 && year % 100 != 0 && year > 0 || year % 400== 0){
          System.out.println( year + " is a leap year" );

      } else if (year <= 0){
          System.out.println(" There is no year like this");

      } else{
          System.out.println(+year+" is not a leap year ");
      }

  }
  public static void main(String args[]){

        leapYear(2000);
        leapYear(1989);
        leapYear(1900);
  }
  }
