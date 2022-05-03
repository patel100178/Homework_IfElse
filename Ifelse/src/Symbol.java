public class Symbol {

 public static void symbol(char c, int a, int b){

  System.out.println(c);
  if(c == '+'){
   System.out.println("Addition of a and b is" +(a+b));
  }
  else if(c == '-'){
   System.out.println("Subtraction of a and b is" +(a-b));
  }
  else if(c == '/'){
   System.out.println(("Division of a and b is" +(a/b)));
  }
  else if(c== '*'){
   System.out.println("Multiplication of a and b is" +(a*b));
  }
  else{
   System.out.println("Please enter valid input");
  }
 }

 public static void main(String args[]){

 symbol('+',25,20);
 symbol('-',20,15);

  }
}

