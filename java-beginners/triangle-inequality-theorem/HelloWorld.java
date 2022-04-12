import java.util.Scanner;

public class HelloWorld{

  public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     int c = scanner.nextInt();
     scanner.close();
     System.out.println("Length 1: " + a);
     System.out.println("Length 2: " + b);
     System.out.println("Length 3: " + c);
     if (a+b>c || a+c>b || c+b>a) {
         System.out.println("These values make a triangle.");
     }
     else {
         System.out.println("These values do not make a triangle.");
     }
  }
}