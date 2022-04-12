public class HelloWorld{

  public static void main(String []args){
     System.out.print("Divided by 3:");
     System.out.println(" ");
     int i = 1;
     while (i<101) {
         if (i%3 == 0) {
             System.out.print(i + ", ");
         }
         i++;
     }
     System.out.println(" ");
     System.out.print("Divided by 5:");
     System.out.println(" ");
     i = 1;
     while (i<101) {
         if (i%5 == 0) {
             System.out.print(i + ", ");
         }
         i++;
     }
     System.out.println(" ");
     System.out.print("Divided by 3 & 5:");
     System.out.println(" ");
     i = 1;
     while (i<101) {
         if (i%15 == 0) {
             System.out.print(i + ", ");
         }
         i++;
     }
  }
}