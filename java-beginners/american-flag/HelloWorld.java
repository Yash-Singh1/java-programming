public class HelloWorld{

  public static void main(String []args){
     int i = 0;
     while (i<6){
        System.out.print("* ");
        i++;
     }
     i = 0;
     while (i<34) {
         System.out.print('=');
         i++;
     }
     System.out.println(' ');
     i = 0;
     while (i < 4) {
         int g = 0;
         System.out.print(" ");
         while (g<5) {
             System.out.print("* ");
             g++;
         }
         System.out.print(" ");
         g = 0;
         while (g<34) {
             System.out.print('=');
             g++;
         }
         System.out.println(" ");
         g = 0;
         while (g<6) {
             System.out.print("* ");
             g++;
         }
         g = 0;
         while (g<34) {
             System.out.print('=');
             g++;
         }
         System.out.println(' ');
         i++;
     } 
     i=0;
     while (i<6) {
         int g = 0;
         while (g<46) {
             System.out.print("=");
             g++;
         }
         System.out.println(" ");
         i++;
     } 
  }
}