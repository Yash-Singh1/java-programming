public class HelloWorld{

     public static void main(String []args){
        int outer = 0;
        while (outer <10) {
            int inner = 0;
            while (inner <= outer) {
                System.out.print("😍");
                inner++;
            }
            outer++;
            System.out.println("");
        }
     }
}